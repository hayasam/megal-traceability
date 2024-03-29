/**
 * generated by Xtext
 */
package org.softlang.megal.language.ui.quickfix;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.softlang.megal.Declaration;
import org.softlang.megal.Entity;
import org.softlang.megal.MegalFactory;
import org.softlang.megal.Megamodel;
import org.softlang.megal.Relationship;
import org.softlang.megal.RelationshipType;
import org.softlang.megal.TypeReference;
import org.softlang.megal.language.validation.MegalValidator;

/**
 * Custom quickfixes.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
@SuppressWarnings("all")
public class MegalQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(MegalValidator.NO_APPLICABLE_INSTANCE)
  public void createApplicableInstance(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final String label = "Create applicable instance";
    final String text = "Creates an instance matching the required types.";
    final Object image = null;
    final ISemanticModification _function = new ISemanticModification() {
      public void apply(final EObject e, final IModificationContext c) throws Exception {
        EClass _eClass = e.eClass();
        EPackage _ePackage = _eClass.getEPackage();
        EFactory _eFactoryInstance = _ePackage.getEFactoryInstance();
        @Extension
        final MegalFactory fac = ((MegalFactory) _eFactoryInstance);
        final Relationship r = ((Relationship) e);
        RelationshipType _createRelationshipType = fac.createRelationshipType();
        final Procedure1<RelationshipType> _function = new Procedure1<RelationshipType>() {
          public void apply(final RelationshipType it) {
            try {
              Entity _left = r.getLeft();
              TypeReference _type = _left.getType();
              TypeReference _copy = EcoreUtil.<TypeReference>copy(_type);
              it.setLeft(_copy);
              String _elvis = null;
              RelationshipType _type_1 = null;
              if (r!=null) {
                _type_1=r.getType();
              }
              String _name = null;
              if (_type_1!=null) {
                _name=_type_1.getName();
              }
              if (_name != null) {
                _elvis = _name;
              } else {
                IXtextDocument _xtextDocument = c.getXtextDocument();
                Integer _offset = issue.getOffset();
                Integer _length = issue.getLength();
                String _get = _xtextDocument.get((_offset).intValue(), (_length).intValue());
                _elvis = _get;
              }
              it.setName(_elvis);
              Entity _right = r.getRight();
              TypeReference _type_2 = _right.getType();
              TypeReference _copy_1 = EcoreUtil.<TypeReference>copy(_type_2);
              it.setRight(_copy_1);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        final RelationshipType q = ObjectExtensions.<RelationshipType>operator_doubleArrow(_createRelationshipType, _function);
        Megamodel _megamodel = r.megamodel();
        EList<Declaration> _declarations = _megamodel.getDeclarations();
        Megamodel _megamodel_1 = r.megamodel();
        EList<Declaration> _declarations_1 = _megamodel_1.getDeclarations();
        int _indexOf = _declarations_1.indexOf(r);
        int _plus = (_indexOf + 1);
        _declarations.add(_plus, q);
        r.setType(q);
      }
    };
    final ISemanticModification fixByCreation = _function;
    acceptor.accept(issue, label, text, ((String)image), fixByCreation);
  }
}
