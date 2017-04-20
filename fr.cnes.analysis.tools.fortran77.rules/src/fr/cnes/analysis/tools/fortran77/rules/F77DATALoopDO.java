/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/*****************************************************************************/
/* This file is used to generate a rule checker for F77.DATA.LoopDO rule. 	 */
/* For further information on this, we advise you to refer to RNC manuals.	 */
/* As many comments have been done on the ExampleRule.lex file, this file    */
/* will restrain its comments on modifications.								 */
/*																			 */
/*****************************************************************************/

package fr.cnes.analysis.tools.fortran77.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;

import fr.cnes.analysis.tools.analyzer.exception.JFlexException;
import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;import fr.cnes.analysis.tools.analyzer.datas.Violation;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/F77DATALoopDO.lex</tt>
 */
public class F77DATALoopDO extends AbstractRule {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int NAMING = 4;
  public static final int NEW_LINE = 6;
  public static final int LINE = 8;
  public static final int ENTER_DO = 10;
  public static final int INDEX = 12;
  public static final int INIT = 14;
  public static final int PAR = 16;
  public static final int PARI = 18;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9, 9
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\51\1\61\1\63\1\63\1\62\22\0\1\56\1\1\1\50"+
    "\4\0\1\47\1\64\1\65\1\4\1\0\1\0\1\0\1\70\1\0"+
    "\12\67\3\0\1\66\3\0\1\36\1\32\1\3\1\24\1\23\1\5"+
    "\1\35\1\55\1\11\2\45\1\43\1\37\1\7\1\12\1\21\1\45"+
    "\1\22\1\31\1\10\1\6\1\45\1\54\1\60\2\45\4\0\1\46"+
    "\1\0\1\41\1\34\1\2\1\30\1\27\1\13\1\40\1\53\1\17"+
    "\2\45\1\44\1\42\1\15\1\20\1\25\1\45\1\26\1\33\1\16"+
    "\1\14\1\45\1\52\1\57\2\45\12\0\1\63\u1fa2\0\1\63\1\63"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\12\0\1\1\3\2\20\1\1\3\1\4\1\5\1\6"+
    "\1\7\2\2\25\5\3\10\1\11\1\12\1\13\1\14"+
    "\2\5\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\10\0\1\24\2\0\1\24\10\0\11\5\1\24\3\5"+
    "\1\24\6\5\1\24\2\0\2\10\1\0\1\25\22\0"+
    "\10\5\1\2\12\5\2\10\10\0\1\26\12\0\10\5"+
    "\1\26\12\5\2\10\20\0\20\5\1\2\16\0\1\27"+
    "\16\5\1\27\12\0\10\5\6\0\4\5\16\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[305];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\u01c8\0\u0201\0\u023a\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e"+
    "\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u04ad\0\u04e6"+
    "\0\u051f\0\u0558\0\u0591\0\u05ca\0\u0603\0\u063c\0\u023a\0\u023a"+
    "\0\u023a\0\u0675\0\u023a\0\u06ae\0\u06e7\0\u0720\0\u0759\0\u0792"+
    "\0\u07cb\0\u0804\0\u083d\0\u0876\0\u08af\0\u08e8\0\u0921\0\u095a"+
    "\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22"+
    "\0\u0b5b\0\u0b94\0\u0bcd\0\u0c06\0\u0c3f\0\u023a\0\u023a\0\u023a"+
    "\0\u023a\0\u0c78\0\u0cb1\0\u0cea\0\u023a\0\u023a\0\u023a\0\u023a"+
    "\0\u023a\0\u023a\0\u0d23\0\u0d5c\0\u0d95\0\u0dce\0\u0e07\0\u0e40"+
    "\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96\0\u0fcf\0\u1008"+
    "\0\u1041\0\u107a\0\u10b3\0\u10ec\0\u0603\0\u063c\0\u1125\0\u115e"+
    "\0\u1197\0\u11d0\0\u1209\0\u1242\0\u127b\0\u12b4\0\u12ed\0\u1326"+
    "\0\u135f\0\u1398\0\u13d1\0\u140a\0\u1443\0\u147c\0\u14b5\0\u14ee"+
    "\0\u1527\0\u1560\0\u0759\0\u0b5b\0\u0b94\0\u1599\0\u15d2\0\u0cb1"+
    "\0\u0cb1\0\u160b\0\u1644\0\u167d\0\u16b6\0\u16ef\0\u1728\0\u1761"+
    "\0\u179a\0\u17d3\0\u180c\0\u1845\0\u187e\0\u18b7\0\u18f0\0\u1929"+
    "\0\u1962\0\u199b\0\u19d4\0\u1a0d\0\u1a46\0\u1a7f\0\u1ab8\0\u1af1"+
    "\0\u1b2a\0\u1b63\0\u1b9c\0\u0759\0\u1bd5\0\u1c0e\0\u1c47\0\u1c80"+
    "\0\u1cb9\0\u1cf2\0\u1d2b\0\u1d64\0\u1d9d\0\u1dd6\0\u1e0f\0\u1e48"+
    "\0\u1e81\0\u1eba\0\u1ef3\0\u1f2c\0\u1f65\0\u1f9e\0\u1fd7\0\u2010"+
    "\0\u023a\0\u2049\0\u2082\0\u20bb\0\u20f4\0\u212d\0\u2166\0\u219f"+
    "\0\u21d8\0\u2211\0\u224a\0\u2283\0\u22bc\0\u22f5\0\u232e\0\u2367"+
    "\0\u23a0\0\u23d9\0\u2412\0\u0759\0\u244b\0\u2484\0\u24bd\0\u24f6"+
    "\0\u252f\0\u2568\0\u25a1\0\u25da\0\u2613\0\u264c\0\u2685\0\u26be"+
    "\0\u26f7\0\u2730\0\u2769\0\u27a2\0\u27db\0\u2814\0\u284d\0\u2886"+
    "\0\u28bf\0\u28f8\0\u2931\0\u296a\0\u29a3\0\u29dc\0\u2a15\0\u2a4e"+
    "\0\u2a87\0\u2ac0\0\u2af9\0\u2b32\0\u2b6b\0\u2ba4\0\u2bdd\0\u2c16"+
    "\0\u2c4f\0\u2c88\0\u2cc1\0\u2cfa\0\u2d33\0\u2d6c\0\u2da5\0\u2dde"+
    "\0\u0bcd\0\u2e17\0\u2e50\0\u2e89\0\u2ec2\0\u2efb\0\u2f34\0\u2f6d"+
    "\0\u2fa6\0\u2fdf\0\u3018\0\u3051\0\u308a\0\u30c3\0\u30fc\0\u023a"+
    "\0\u3135\0\u316e\0\u31a7\0\u31e0\0\u3219\0\u3252\0\u328b\0\u32c4"+
    "\0\u32fd\0\u3336\0\u336f\0\u33a8\0\u33e1\0\u341a\0\u0759\0\u3453"+
    "\0\u348c\0\u34c5\0\u34fe\0\u3537\0\u3570\0\u35a9\0\u35e2\0\u361b"+
    "\0\u3654\0\u368d\0\u36c6\0\u36ff\0\u3738\0\u3771\0\u37aa\0\u37e3"+
    "\0\u381c\0\u3855\0\u388e\0\u38c7\0\u3900\0\u3939\0\u3972\0\u39ab"+
    "\0\u39e4\0\u3a1d\0\u3a56\0\u3a8f\0\u3ac8\0\u3b01\0\u3b3a\0\u3b73"+
    "\0\u3bac\0\u3be5\0\u3c1e\0\u3c57\0\u3c90\0\u3cc9\0\u3d02\0\u3d3b"+
    "\0\u3d74";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[305];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\13\1\14\1\15\1\16\1\14\1\17\5\13\1\20"+
    "\5\13\1\21\1\22\1\13\1\23\1\24\1\25\1\13"+
    "\1\26\1\27\1\13\1\30\3\13\1\31\2\13\1\32"+
    "\1\33\1\34\2\13\1\35\1\36\10\13\1\37\2\40"+
    "\5\13\1\41\1\14\57\41\1\37\2\40\6\41\1\14"+
    "\2\42\1\41\41\42\4\41\4\42\1\41\2\42\1\43"+
    "\2\40\5\41\1\13\1\14\1\44\1\45\1\14\1\46"+
    "\5\47\1\50\5\47\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\47\1\62\3\47\1\63"+
    "\2\47\1\64\1\65\1\66\1\47\1\13\1\35\1\36"+
    "\1\41\4\47\1\41\2\47\2\41\1\40\5\13\1\41"+
    "\1\14\2\47\1\41\1\46\5\47\1\50\5\47\1\51"+
    "\1\47\1\53\1\67\1\55\1\47\1\57\1\70\1\61"+
    "\1\47\1\62\3\47\1\63\2\47\1\64\3\47\1\41"+
    "\1\71\1\72\1\41\4\47\1\41\2\47\1\37\2\40"+
    "\6\41\1\14\2\73\1\41\41\73\4\41\1\74\1\73"+
    "\1\75\1\73\1\41\2\73\1\76\2\40\2\41\1\77"+
    "\3\41\1\14\2\73\1\41\41\73\4\41\4\73\1\41"+
    "\2\73\1\100\2\40\1\101\2\41\1\102\1\103\1\41"+
    "\1\14\2\104\1\41\41\104\4\41\4\104\1\41\2\104"+
    "\1\105\2\40\1\106\5\41\1\14\57\41\1\37\2\40"+
    "\1\107\1\110\4\41\1\14\57\41\1\111\2\40\1\107"+
    "\1\112\3\41\111\0\1\113\32\0\1\114\27\0\1\115"+
    "\42\0\1\116\21\0\1\117\76\0\1\120\76\0\1\121"+
    "\71\0\1\122\57\0\1\123\104\0\1\124\71\0\1\125"+
    "\61\0\1\126\56\0\1\127\76\0\1\130\66\0\1\131"+
    "\76\0\1\132\62\0\1\133\76\0\1\134\50\0\47\135"+
    "\1\13\21\135\50\136\1\13\20\136\2\0\2\42\1\0"+
    "\42\42\3\0\4\42\1\0\2\42\6\0\1\42\3\0"+
    "\2\47\1\0\13\47\1\137\26\47\3\0\1\47\1\140"+
    "\2\47\1\0\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\5\47\1\141\34\47\3\0\3\47\1\142\1\0\2\47"+
    "\6\0\1\47\3\0\2\47\1\0\1\47\1\143\40\47"+
    "\3\0\4\47\1\0\2\47\6\0\1\47\3\0\2\47"+
    "\1\0\42\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\7\47\1\144\32\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\2\47\1\0\15\47"+
    "\1\145\24\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\16\47\1\146\23\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\2\47\1\0\2\47"+
    "\1\147\37\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\5\47\1\150\34\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\2\47\1\0\21\47"+
    "\1\151\20\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\22\47\1\152\17\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\2\47\1\0\10\47"+
    "\1\153\31\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\13\47\1\154\26\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\2\47\1\0\1\47"+
    "\1\155\40\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\7\47\1\156\32\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\2\47\1\0\5\47"+
    "\1\157\34\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\13\47\1\160\26\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\2\47\1\0\5\47"+
    "\1\161\34\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\13\47\1\162\26\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\2\47\1\0\5\47"+
    "\1\163\34\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\13\47\1\163\26\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\1\0\47\164\1\41\21\164"+
    "\50\165\1\41\20\165\2\0\2\73\1\0\42\73\3\0"+
    "\4\73\1\0\2\73\6\0\1\73\3\0\2\73\1\0"+
    "\42\73\3\0\1\73\1\166\2\73\1\0\2\73\6\0"+
    "\1\73\3\0\2\73\1\0\42\73\3\0\3\73\1\167"+
    "\1\0\2\73\6\0\1\73\70\0\1\102\1\170\67\0"+
    "\1\171\3\0\2\104\1\0\42\104\3\0\4\104\1\0"+
    "\2\104\6\0\1\104\43\0\1\172\67\0\1\173\66\0"+
    "\1\174\67\0\1\175\41\0\1\176\76\0\1\177\65\0"+
    "\1\200\114\0\1\201\40\0\1\202\102\0\1\203\111\0"+
    "\1\204\43\0\1\205\106\0\1\206\72\0\1\207\60\0"+
    "\1\210\74\0\1\211\75\0\1\212\73\0\1\213\32\0"+
    "\2\47\1\0\35\47\1\214\4\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\34\47\1\215"+
    "\5\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\32\47\1\216\7\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\31\47\1\217"+
    "\10\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\2\47\1\220\37\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\10\47\1\221"+
    "\31\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\5\47\1\222\34\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\31\47\1\223"+
    "\10\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\17\47\1\224\22\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\1\47\1\225"+
    "\40\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\13\47\1\226\26\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\34\47\1\227"+
    "\5\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\23\47\1\224\16\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\7\47\1\230"+
    "\32\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\25\47\1\231\14\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\27\47\1\232"+
    "\12\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\17\47\1\233\22\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\23\47\1\234"+
    "\16\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\30\47\1\235\11\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\33\47\1\236"+
    "\6\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\73\1\0\12\73\1\237\27\73\3\0\4\73\1\0"+
    "\2\73\6\0\1\73\3\0\2\73\1\0\4\73\1\240"+
    "\35\73\3\0\4\73\1\0\2\73\6\0\1\73\26\0"+
    "\1\241\71\0\1\242\63\0\1\243\71\0\1\244\51\0"+
    "\1\245\67\0\1\246\71\0\1\247\31\0\1\250\76\0"+
    "\1\251\57\0\1\252\40\0\1\253\35\0\1\254\74\0"+
    "\1\251\60\0\1\255\56\0\1\256\74\0\1\257\50\0"+
    "\1\260\76\0\1\261\65\0\1\262\76\0\1\263\53\0"+
    "\2\47\1\0\20\47\1\264\21\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\21\47\1\265"+
    "\20\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\14\47\1\266\25\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\15\47\1\267"+
    "\24\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\1\47\1\270\1\0\42\47\3\0\4\47\1\0\2\47"+
    "\6\0\1\47\3\0\1\271\1\47\1\0\42\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\1\47\1\272"+
    "\1\0\30\47\1\273\11\47\3\0\4\47\1\0\2\47"+
    "\6\0\1\47\3\0\2\47\1\0\36\47\1\274\3\47"+
    "\3\0\4\47\1\0\2\47\6\0\1\47\3\0\2\47"+
    "\1\0\25\47\1\275\14\47\3\0\4\47\1\0\2\47"+
    "\6\0\1\47\3\0\1\276\1\47\1\0\33\47\1\277"+
    "\6\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\37\47\1\274\2\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\27\47\1\300"+
    "\12\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\15\47\1\301\24\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\21\47\1\302"+
    "\20\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\1\47\1\303\40\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\7\47\1\304"+
    "\32\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\4\47\1\305\35\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\12\47\1\306"+
    "\27\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\73\1\0\37\73\1\307\2\73\3\0\4\73\1\0"+
    "\2\73\6\0\1\73\3\0\2\73\1\0\36\73\1\310"+
    "\3\73\3\0\4\73\1\0\2\73\6\0\1\73\45\0"+
    "\1\311\65\0\1\312\72\0\1\313\63\0\1\314\42\0"+
    "\1\315\76\0\1\316\75\0\1\317\67\0\1\320\111\0"+
    "\1\321\54\0\1\322\67\0\1\323\106\0\1\324\36\0"+
    "\1\325\76\0\1\326\113\0\1\327\71\0\1\330\27\0"+
    "\1\122\67\0\1\125\70\0\2\47\1\0\37\47\1\331"+
    "\2\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\34\47\1\332\5\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\36\47\1\333"+
    "\3\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\31\47\1\334\10\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\3\47\1\335"+
    "\36\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\11\47\1\336\30\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\16\47\1\337"+
    "\23\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\15\47\1\340\24\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\36\47\1\341"+
    "\3\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\22\47\1\342\17\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\21\47\1\343"+
    "\20\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\37\47\1\344\2\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\5\47\1\345"+
    "\34\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\13\47\1\346\26\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\36\47\1\347"+
    "\3\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\37\47\1\350\2\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\1\47\1\146\1\0\42\47"+
    "\3\0\4\47\1\0\2\47\6\0\1\47\3\0\1\152"+
    "\1\47\1\0\42\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\73\1\0\22\73\1\351\17\73\3\0"+
    "\4\73\1\0\2\73\6\0\1\73\3\0\2\73\1\0"+
    "\16\73\1\351\23\73\3\0\4\73\1\0\2\73\6\0"+
    "\1\73\30\0\1\352\43\0\1\353\111\0\1\354\50\0"+
    "\1\355\76\0\1\356\76\0\1\357\75\0\1\360\102\0"+
    "\1\361\55\0\1\362\75\0\1\363\101\0\1\364\56\0"+
    "\1\365\47\0\1\366\76\0\1\367\77\0\1\370\74\0"+
    "\1\370\43\0\2\47\1\0\22\47\1\371\17\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\1\372\1\47"+
    "\1\0\42\47\3\0\4\47\1\0\2\47\6\0\1\47"+
    "\3\0\2\47\1\0\16\47\1\373\23\47\3\0\4\47"+
    "\1\0\2\47\6\0\1\47\3\0\1\47\1\374\1\0"+
    "\42\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\4\47\1\375\35\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\12\47\1\376"+
    "\27\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\17\47\1\377\22\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\31\47\1\u0100"+
    "\10\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\16\47\1\u0101\23\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\23\47\1\u0102"+
    "\16\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\34\47\1\u0103\5\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\22\47\1\u0104"+
    "\17\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\1\47\1\u0105\40\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\7\47\1\u0106"+
    "\32\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\16\47\1\u0107\23\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\22\47\1\u0107"+
    "\17\47\3\0\4\47\1\0\2\47\6\0\1\47\60\0"+
    "\1\251\27\0\1\u0108\132\0\1\251\20\0\1\u0109\72\0"+
    "\1\u010a\76\0\1\u010b\56\0\1\u010c\121\0\1\370\107\0"+
    "\1\u010d\26\0\1\u010e\116\0\1\370\104\0\1\u010f\22\0"+
    "\1\u0110\76\0\1\u0111\54\0\2\47\1\0\42\47\3\0"+
    "\4\47\1\0\1\274\1\47\6\0\1\47\3\0\2\47"+
    "\1\0\11\47\1\u0112\30\47\3\0\4\47\1\0\2\47"+
    "\6\0\1\47\3\0\2\47\1\0\42\47\3\0\4\47"+
    "\1\0\1\47\1\274\6\0\1\47\3\0\2\47\1\0"+
    "\3\47\1\u0113\36\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\5\47\1\u0114\34\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\13\47\1\u0115\26\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\1\47\1\u0116\40\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\32\47\1\u0107\7\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\42\47\3\0\4\47\1\u010d"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\7\47\1\u0117"+
    "\32\47\3\0\4\47\1\0\2\47\6\0\1\47\3\0"+
    "\2\47\1\0\35\47\1\u0107\4\47\3\0\4\47\1\0"+
    "\2\47\6\0\1\47\3\0\2\47\1\0\42\47\3\0"+
    "\4\47\1\u010f\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\3\47\1\u0118\36\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\11\47\1\u0119\30\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\30\0\1\u011a\64\0"+
    "\1\u011b\54\0\1\370\76\0\1\370\75\0\1\327\67\0"+
    "\1\u011c\34\0\1\u010d\40\0\1\330\67\0\1\u011d\30\0"+
    "\1\u010f\23\0\1\u011e\76\0\1\u011f\53\0\2\47\1\0"+
    "\22\47\1\u0120\17\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\16\47\1\u0121\23\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\2\47\1\u0107\37\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\10\47\1\u0107\31\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\15\47\1\347\24\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\21\47\1\350\20\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\4\47\1\u0122\35\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\12\47\1\u0123\27\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\27\0\1\251\64\0"+
    "\1\251\70\0\1\u0124\74\0\1\u0125\51\0\1\327\76\0"+
    "\1\330\55\0\2\47\1\0\21\47\1\274\20\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\15\47\1\274\24\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\3\0\2\47\1\0\2\47\1\347\37\47\3\0"+
    "\4\47\1\0\2\47\6\0\1\47\3\0\2\47\1\0"+
    "\10\47\1\350\31\47\3\0\4\47\1\0\2\47\6\0"+
    "\1\47\24\0\1\u0126\74\0\1\u0127\44\0\1\u0128\67\0"+
    "\1\u0129\77\0\1\u012a\76\0\1\u012b\102\0\1\u012c\72\0"+
    "\1\u012d\46\0\1\u012e\76\0\1\u012f\63\0\1\u0130\76\0"+
    "\1\u0131\57\0\1\251\76\0\1\251\53\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[15789];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\12\0\2\11\22\1\3\11\1\1\1\11\32\1\4\11"+
    "\3\1\6\11\10\0\1\1\2\0\1\1\10\0\25\1"+
    "\2\0\2\1\1\0\1\1\22\0\25\1\10\0\1\11"+
    "\12\0\25\1\20\0\21\1\16\0\1\11\17\1\12\0"+
    "\10\1\6\0\4\1\16\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[305];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	String location = "MAIN PROGRAM";
	
	
	public F77DATALoopDO() {
    }
	
	@Override
	public void setInputFile(IPath file) throws FileNotFoundException {
		super.setInputFile(file);
		this.zzReader = new FileReader(file.toOSString());
	}
	boolean violation = false;
	List<String> wrongTypeVariables = new LinkedList<String>();
	int LAST_STATE = LINE;
	int par = 0;
	String variable = "";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public F77DATALoopDO(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public List<Violation> run() throws java.io.IOException, JFlexException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          {     return getViolations();
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(LINE);
            }
          case 24: break;
          case 2: 
            { yybegin(COMMENT);
            }
          case 25: break;
          case 3: 
            { yybegin(NEW_LINE);
            }
          case 26: break;
          case 4: 
            { throw new JFlexException( new Exception("Illegal character <" + yytext() + ">") );
            }
          case 27: break;
          case 5: 
            { 
            }
          case 28: break;
          case 6: 
            { location = location + " " + yytext();
								 wrongTypeVariables.clear();
								 yybegin(COMMENT);
            }
          case 29: break;
          case 7: 
            { wrongTypeVariables.clear();
								 yybegin(NEW_LINE);
            }
          case 30: break;
          case 8: 
            { if (wrongTypeVariables.contains(yytext())) { violation = true; variable = variable + " " + yytext(); }
            }
          case 31: break;
          case 9: 
            { violation=false; yybegin(NEW_LINE);
            }
          case 32: break;
          case 10: 
            { yybegin(INDEX);
            }
          case 33: break;
          case 11: 
            { if (violation) this.setError(location,"The control variable in a loop shall be an integer.", yyline + 1);
								 violation = false; variable = "";
								 yybegin(NEW_LINE);
            }
          case 34: break;
          case 12: 
            { par=1; yybegin(PAR);
            }
          case 35: break;
          case 13: 
            { wrongTypeVariables.add(yytext());
            }
          case 36: break;
          case 14: 
            { LAST_STATE = INIT;
								 yybegin(NEW_LINE);
            }
          case 37: break;
          case 15: 
            { par=1; yybegin(PARI);
            }
          case 38: break;
          case 16: 
            { par++;
            }
          case 39: break;
          case 17: 
            { par--; if(par==0) yybegin(INDEX);
            }
          case 40: break;
          case 18: 
            { yybegin(LAST_STATE);
            }
          case 41: break;
          case 19: 
            { par--; if(par==0) yybegin(INIT);
            }
          case 42: break;
          case 20: 
            { yybegin(ENTER_DO);
            }
          case 43: break;
          case 21: 
            { violation = true;  variable = variable + " " + yytext();
            }
          case 44: break;
          case 22: 
            { yybegin(INIT);
            }
          case 45: break;
          case 23: 
            { location = yytext();
								 yybegin(NAMING);
            }
          case 46: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
