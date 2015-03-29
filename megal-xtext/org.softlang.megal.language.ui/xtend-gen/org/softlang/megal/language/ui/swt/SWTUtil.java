package org.softlang.megal.language.ui.swt;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class SWTUtil {
  public static int parseStyleFragment(final String s) {
    int _switchResult = (int) 0;
    String _lowerCase = s.toLowerCase();
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_lowerCase, "normal")) {
        _matched=true;
        _switchResult = SWT.NORMAL;
      }
    }
    if (!_matched) {
      if (Objects.equal(_lowerCase, "italic")) {
        _matched=true;
        _switchResult = SWT.ITALIC;
      }
    }
    if (!_matched) {
      if (Objects.equal(_lowerCase, "bold")) {
        _matched=true;
        _switchResult = SWT.BOLD;
      }
    }
    if (!_matched) {
      _switchResult = SWT.NORMAL;
    }
    return _switchResult;
  }
  
  private final static String STYLE_SEPARATOR = ",";
  
  public static Integer parseStyle(final String s) {
    String[] _split = s.split(SWTUtil.STYLE_SEPARATOR);
    final Function1<String, Integer> _function = new Function1<String, Integer>() {
      public Integer apply(final String it) {
        return Integer.valueOf(SWTUtil.parseStyleFragment(it));
      }
    };
    List<Integer> _map = ListExtensions.<String, Integer>map(((List<String>)Conversions.doWrapArray(_split)), _function);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer a, final Integer b) {
        return Integer.valueOf(((a).intValue() | (b).intValue()));
      }
    };
    return IterableExtensions.<Integer, Integer>fold(_map, Integer.valueOf(SWT.NORMAL), _function_1);
  }
  
  public static Integer parseColorFragment(final String s) {
    return Integer.valueOf(s);
  }
  
  private final static String COLOR_SEPARATOR = ",";
  
  public static RGB parseColor(final String s) {
    RGB _xblockexpression = null;
    {
      String[] _split = s.split(SWTUtil.COLOR_SEPARATOR);
      final Function1<String, Integer> _function = new Function1<String, Integer>() {
        public Integer apply(final String it) {
          return SWTUtil.parseColorFragment(it);
        }
      };
      final List<Integer> c = ListExtensions.<String, Integer>map(((List<String>)Conversions.doWrapArray(_split)), _function);
      Integer _get = c.get(0);
      Integer _get_1 = c.get(1);
      Integer _get_2 = c.get(2);
      _xblockexpression = new RGB((_get).intValue(), (_get_1).intValue(), (_get_2).intValue());
    }
    return _xblockexpression;
  }
}
