/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/*****************************************************************************/
/* This file is used to generate a rule checker for Tr.BoucleSortie rule. 	 */
/* For further information on this, we advise you to refer to RNC manuals.	 */
/* As many comments have been done on the ExampleRule.lex file, this file    */
/* will restrain its comments on modifications.								 */
/*																			 */
/*****************************************************************************/

package fr.cnes.analysis.tools.fortran90.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;

import fr.cnes.analysis.tools.analyzer.exception.JFlexException;
import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;
import fr.cnes.analysis.tools.analyzer.datas.Violation;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/COMFLOWExitLoop.lex</tt>
 */
public class COMFLOWExitLoop extends AbstractRule {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int NAMING = 4;
  public static final int IFLINE = 6;
  public static final int AVOID = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\27\1\36\1\37\1\40\1\36\22\0\1\27\1\1\1\32"+
    "\3\0\1\41\1\31\2\0\1\3\5\0\12\24\7\0\1\21\1\17"+
    "\1\2\1\15\1\14\1\4\1\20\1\35\1\25\2\30\1\23\1\22"+
    "\1\6\1\11\1\12\1\30\1\13\1\26\1\7\1\5\2\30\1\33"+
    "\1\34\1\30\4\0\1\24\1\0\1\21\1\17\1\2\1\15\1\14"+
    "\1\4\1\20\1\35\1\25\2\30\1\23\1\22\1\6\1\11\1\12"+
    "\1\30\1\13\1\26\1\7\1\5\2\30\1\33\1\34\1\30\12\0"+
    "\1\37\252\0\2\10\115\0\1\16\u1ea8\0\1\37\1\37\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\2\2\11\1\1\2\1\3\1\4\1\5"+
    "\1\1\1\2\1\6\1\4\1\7\1\6\1\7\44\0"+
    "\1\6\6\1\51\0\1\10\3\0\1\11\15\0\1\10"+
    "\3\0\1\11\4\0\1\10\3\0\1\11\11\0\1\12"+
    "\16\0\1\12\1\1\4\0\1\12\14\0\1\12\1\13"+
    "\12\0\1\14\6\0\1\12\2\1\1\13\7\0\1\12"+
    "\1\1\1\13\1\0\1\15\1\16\17\0\1\1\62\0"+
    "\1\12\10\0\1\12\7\0\1\12\103\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[374];
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
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\252\0\314"+
    "\0\356\0\314\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba"+
    "\0\u01dc\0\u01dc\0\u01fe\0\u01dc\0\u0220\0\u0242\0\u0242\0\u0264"+
    "\0\u0242\0\u0286\0\u01dc\0\u02a8\0\u02ca\0\u02ec\0\u030e\0\u0330"+
    "\0\u0352\0\u0374\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440"+
    "\0\u0462\0\u0484\0\u04a6\0\u04c8\0\u04ea\0\u050c\0\u052e\0\u0550"+
    "\0\u0572\0\u0594\0\u05b6\0\u05d8\0\u05fa\0\u061c\0\u063e\0\u0660"+
    "\0\u0682\0\u06a4\0\u06c6\0\u06e8\0\u070a\0\u072c\0\u074e\0\u0770"+
    "\0\u0792\0\u06e8\0\u070a\0\u072c\0\u074e\0\u0770\0\u02a8\0\u07b4"+
    "\0\u07d6\0\u07f8\0\u081a\0\u083c\0\u085e\0\u0880\0\u08a2\0\u08c4"+
    "\0\u08e6\0\u0908\0\u092a\0\u094c\0\u096e\0\u0990\0\u09b2\0\u09d4"+
    "\0\u09f6\0\u0a18\0\u0a3a\0\u0a5c\0\u0a7e\0\u0aa0\0\u0ac2\0\u0ae4"+
    "\0\u0b06\0\u0b28\0\u0b4a\0\u0b6c\0\u0b8e\0\u0bb0\0\u0bd2\0\u0bf4"+
    "\0\u0c16\0\u0c38\0\u0c5a\0\u0c7c\0\u0c9e\0\u0cc0\0\u0ce2\0\u0d04"+
    "\0\u01dc\0\u0d26\0\u0d48\0\u0d6a\0\u01dc\0\u0d8c\0\u0dae\0\u0dd0"+
    "\0\u0df2\0\u0e14\0\u0e36\0\u0e58\0\u0e7a\0\u0e9c\0\u0ebe\0\u0ee0"+
    "\0\u0f02\0\u0f24\0\u04c8\0\u0f46\0\u0f68\0\u0f8a\0\u04c8\0\u0fac"+
    "\0\u0fce\0\u0ff0\0\u1012\0\u05d8\0\u1034\0\u1056\0\u1078\0\u05d8"+
    "\0\u109a\0\u10bc\0\u10de\0\u1100\0\u1122\0\u1144\0\u1166\0\u1188"+
    "\0\u11aa\0\u11cc\0\u11ee\0\u1210\0\u1232\0\u1254\0\u1276\0\u1298"+
    "\0\u12ba\0\u12dc\0\u12fe\0\u1320\0\u1342\0\u1364\0\u1386\0\u13a8"+
    "\0\u13ca\0\u11cc\0\u13ec\0\u140e\0\u1430\0\u1452\0\u1474\0\u1496"+
    "\0\u14b8\0\u14da\0\u14fc\0\u151e\0\u1540\0\u1562\0\u1584\0\u15a6"+
    "\0\u15c8\0\u15ea\0\u160c\0\u162e\0\u01dc\0\u1650\0\u1672\0\u1694"+
    "\0\u16b6\0\u16d8\0\u16fa\0\u171c\0\u173e\0\u1760\0\u1782\0\u17a4"+
    "\0\u17c6\0\u17e8\0\u180a\0\u182c\0\u184e\0\u1870\0\u1892\0\u1562"+
    "\0\u04c8\0\u04c8\0\u18b4\0\u18d6\0\u18f8\0\u191a\0\u193c\0\u195e"+
    "\0\u1980\0\u19a2\0\u05d8\0\u05d8\0\u19c4\0\u01dc\0\u01dc\0\u19e6"+
    "\0\u1a08\0\u1a2a\0\u1a4c\0\u1a6e\0\u1a90\0\u1ab2\0\u1ad4\0\u1af6"+
    "\0\u1b18\0\u1b3a\0\u1b5c\0\u1b7e\0\u1ba0\0\u1bc2\0\u17a4\0\u1be4"+
    "\0\u1c06\0\u1c28\0\u1c4a\0\u1c6c\0\u1c8e\0\u1cb0\0\u1cd2\0\u1cf4"+
    "\0\u1d16\0\u1d38\0\u1d5a\0\u1d7c\0\u1d9e\0\u1dc0\0\u1de2\0\u1e04"+
    "\0\u1e26\0\u1e48\0\u1e6a\0\u1e8c\0\u1eae\0\u1ed0\0\u1ef2\0\u1f14"+
    "\0\u1f36\0\u1f58\0\u1f7a\0\u1f9c\0\u1fbe\0\u1fe0\0\u2002\0\u2024"+
    "\0\u2046\0\u2068\0\u208a\0\u20ac\0\u20ce\0\u20f0\0\u2112\0\u2134"+
    "\0\u2156\0\u2178\0\u219a\0\u21bc\0\u21de\0\u2200\0\u2222\0\u2244"+
    "\0\u2266\0\u01dc\0\u2288\0\u22aa\0\u22cc\0\u22ee\0\u2310\0\u2332"+
    "\0\u2354\0\u2376\0\u04c8\0\u2398\0\u23ba\0\u23dc\0\u23fe\0\u2420"+
    "\0\u2442\0\u2464\0\u05d8\0\u2486\0\u24a8\0\u24ca\0\u24ec\0\u250e"+
    "\0\u2530\0\u2552\0\u2574\0\u2596\0\u25b8\0\u25da\0\u25fc\0\u261e"+
    "\0\u2640\0\u2662\0\u2684\0\u26a6\0\u26c8\0\u26ea\0\u270c\0\u272e"+
    "\0\u2750\0\u2772\0\u2794\0\u27b6\0\u27d8\0\u27fa\0\u281c\0\u283e"+
    "\0\u2860\0\u2882\0\u28a4\0\u28c6\0\u28e8\0\u290a\0\u292c\0\u294e"+
    "\0\u2970\0\u2992\0\u29b4\0\u29d6\0\u29f8\0\u2a1a\0\u2a3c\0\u2a5e"+
    "\0\u2a80\0\u2aa2\0\u2ac4\0\u2ae6\0\u2b08\0\u2b2a\0\u2b4c\0\u2b6e"+
    "\0\u2b90\0\u2bb2\0\u2bd4\0\u2bf6\0\u2c18\0\u2c3a\0\u2c5c\0\u2c7e"+
    "\0\u2ca0\0\u2cc2\0\u2ce4\0\u2d06\0\u2d28\0\u2d4a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[374];
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
    "\1\6\1\7\1\10\1\7\1\11\3\12\1\6\1\12"+
    "\1\13\3\12\1\14\3\12\1\15\3\12\1\16\1\6"+
    "\1\12\1\17\1\20\3\12\4\6\1\21\1\22\34\21"+
    "\1\23\2\24\2\21\1\22\1\25\1\21\4\25\1\21"+
    "\5\25\1\21\5\25\1\21\2\25\1\21\1\25\2\21"+
    "\3\25\1\23\2\24\1\21\1\26\1\27\1\21\1\26"+
    "\4\21\1\26\5\21\1\26\10\21\1\26\1\21\2\26"+
    "\3\21\1\30\2\31\1\32\1\33\1\22\37\33\1\34"+
    "\2\0\1\35\5\0\1\36\3\0\1\37\1\40\1\41"+
    "\1\0\1\42\1\0\1\43\2\0\1\36\1\41\17\0"+
    "\1\44\5\0\1\45\3\0\1\46\3\0\1\47\3\0"+
    "\1\46\17\0\1\44\1\50\4\0\1\45\3\0\1\46"+
    "\3\0\1\47\3\0\1\46\17\0\1\44\5\0\1\45"+
    "\1\51\2\0\1\46\3\0\1\47\3\0\1\46\15\0"+
    "\1\35\2\0\1\52\2\0\1\36\3\0\1\37\1\40"+
    "\1\41\1\0\1\42\1\0\1\43\2\0\1\36\1\41"+
    "\17\0\1\44\4\0\1\53\1\45\3\0\1\46\3\0"+
    "\1\47\3\0\1\46\17\0\1\44\1\52\4\0\1\45"+
    "\3\0\1\46\3\0\1\47\3\0\1\46\13\0\2\54"+
    "\1\55\5\54\1\56\3\54\1\57\1\60\1\61\1\54"+
    "\1\62\1\54\1\63\2\54\1\56\1\61\2\54\1\21"+
    "\10\54\2\64\1\65\5\64\1\66\3\64\1\67\1\70"+
    "\1\71\1\64\1\72\1\64\1\73\2\64\1\66\1\71"+
    "\3\64\1\21\7\64\100\0\1\23\5\0\1\25\1\0"+
    "\4\25\1\0\5\25\1\0\10\25\1\0\1\25\2\0"+
    "\3\25\6\0\1\74\4\0\1\75\4\0\1\76\1\0"+
    "\1\77\1\0\1\100\5\0\1\77\15\0\1\74\4\0"+
    "\1\75\4\0\1\76\1\0\1\77\1\0\1\100\5\0"+
    "\1\77\7\0\1\101\3\0\2\21\1\102\4\21\1\103"+
    "\4\21\1\104\1\21\1\105\1\21\1\106\5\21\1\105"+
    "\1\107\6\21\1\0\1\21\1\107\30\21\1\107\6\21"+
    "\1\0\1\21\1\107\1\21\34\0\1\110\11\0\1\111"+
    "\43\0\1\112\14\0\1\113\7\0\1\114\17\0\1\115"+
    "\37\0\1\116\43\0\1\117\41\0\1\120\35\0\1\121"+
    "\47\0\1\122\33\0\1\123\45\0\1\124\36\0\1\125"+
    "\44\0\1\126\47\0\1\127\37\0\1\130\24\0\31\54"+
    "\1\21\41\54\1\21\2\54\1\131\11\54\1\132\24\54"+
    "\1\21\16\54\1\133\14\54\1\134\5\54\1\21\1\54"+
    "\1\135\17\54\1\136\17\54\1\21\17\54\1\137\21\54"+
    "\1\21\21\54\1\140\17\54\1\21\21\54\1\141\17\54"+
    "\1\21\10\54\32\64\1\21\41\64\1\21\1\64\1\142"+
    "\11\64\1\143\25\64\1\21\15\64\1\144\14\64\1\145"+
    "\6\64\1\21\1\146\17\64\1\147\20\64\1\21\16\64"+
    "\1\150\22\64\1\21\20\64\1\151\20\64\1\21\20\64"+
    "\1\152\20\64\1\21\7\64\34\0\1\153\42\0\1\154"+
    "\37\0\1\155\15\0\1\156\43\0\1\157\66\0\1\101"+
    "\5\0\1\160\37\0\2\161\1\0\1\161\4\0\1\161"+
    "\5\0\1\161\10\0\1\161\1\0\2\161\3\0\4\161"+
    "\15\0\1\162\42\0\1\163\7\0\1\163\23\0\1\164"+
    "\14\0\1\164\14\0\2\165\1\0\1\165\4\0\1\165"+
    "\5\0\1\165\10\0\1\165\1\0\2\165\3\0\4\165"+
    "\11\0\1\166\37\0\1\167\17\0\1\117\10\0\1\117"+
    "\16\0\1\170\32\0\1\171\44\0\1\172\47\0\1\173"+
    "\37\0\1\174\26\0\1\175\41\0\1\176\15\0\1\177"+
    "\34\0\1\200\33\0\1\201\34\0\2\54\1\202\26\54"+
    "\1\21\10\54\2\203\1\54\1\203\4\54\1\203\5\54"+
    "\1\203\10\54\1\203\1\54\1\21\1\203\3\54\4\203"+
    "\15\54\1\204\13\54\1\21\26\54\1\205\7\54\1\205"+
    "\2\54\1\21\20\54\1\206\14\54\1\206\3\54\1\21"+
    "\10\54\2\207\1\54\1\207\4\54\1\207\5\54\1\207"+
    "\10\54\1\207\1\54\1\21\1\207\3\54\4\207\11\54"+
    "\1\210\17\54\1\21\17\54\1\211\17\54\1\140\1\54"+
    "\1\21\6\54\1\140\16\54\1\212\13\54\1\21\10\54"+
    "\2\64\1\213\27\64\1\21\7\64\2\214\1\64\1\214"+
    "\4\64\1\214\5\64\1\214\10\64\1\214\1\64\1\214"+
    "\1\21\3\64\4\214\15\64\1\215\14\64\1\21\25\64"+
    "\1\216\7\64\1\216\3\64\1\21\17\64\1\217\14\64"+
    "\1\217\4\64\1\21\7\64\2\220\1\64\1\220\4\64"+
    "\1\220\5\64\1\220\10\64\1\220\1\64\1\220\1\21"+
    "\3\64\4\220\11\64\1\221\20\64\1\21\16\64\1\222"+
    "\17\64\1\151\2\64\1\21\5\64\1\151\16\64\1\223"+
    "\14\64\1\21\7\64\2\0\1\224\53\0\1\225\35\0"+
    "\1\226\14\0\1\226\25\0\1\227\37\0\1\230\17\0"+
    "\1\157\10\0\1\157\24\0\1\231\16\0\2\232\1\0"+
    "\1\232\4\0\1\232\5\0\1\232\10\0\1\232\1\0"+
    "\2\232\3\0\4\232\14\0\1\233\34\0\1\234\44\0"+
    "\1\234\40\0\1\234\35\0\1\235\36\0\1\236\41\0"+
    "\1\237\15\0\1\240\34\0\1\241\33\0\1\242\43\0"+
    "\1\243\46\0\1\244\40\0\1\245\37\0\1\246\53\0"+
    "\1\247\16\0\23\54\1\250\5\54\1\21\10\54\2\251"+
    "\1\54\1\251\4\54\1\251\5\54\1\251\10\54\1\251"+
    "\1\54\1\252\1\251\3\54\4\251\14\54\1\253\14\54"+
    "\1\21\17\54\1\254\21\54\1\21\22\54\1\254\16\54"+
    "\1\21\21\54\1\254\17\54\1\21\15\54\1\255\23\54"+
    "\1\21\10\54\23\64\1\256\6\64\1\21\7\64\2\257"+
    "\1\64\1\257\4\64\1\257\5\64\1\257\10\64\1\257"+
    "\1\64\1\257\1\252\3\64\4\257\14\64\1\260\15\64"+
    "\1\21\16\64\1\261\22\64\1\21\21\64\1\261\17\64"+
    "\1\21\20\64\1\261\20\64\1\21\14\64\1\262\24\64"+
    "\1\21\7\64\23\0\1\263\24\0\1\264\42\0\1\265"+
    "\44\0\1\265\40\0\1\265\44\0\1\234\25\0\2\266"+
    "\1\0\1\266\1\267\3\0\1\266\1\0\1\270\3\0"+
    "\1\271\3\0\1\272\3\0\1\273\1\274\1\0\2\266"+
    "\3\0\2\266\1\274\1\266\2\21\1\0\1\21\4\0"+
    "\1\21\5\0\1\21\10\0\1\21\1\0\2\21\3\0"+
    "\4\21\2\275\1\0\1\275\4\0\1\275\5\0\1\275"+
    "\10\0\1\275\1\0\2\275\3\0\4\275\23\0\1\276"+
    "\25\0\1\277\46\0\1\300\40\0\1\301\37\0\1\302"+
    "\53\0\1\303\26\0\1\304\14\0\1\304\31\0\1\305"+
    "\45\0\1\306\25\0\1\307\50\0\1\310\25\0\14\54"+
    "\1\254\14\54\1\21\10\54\2\311\1\54\1\311\1\312"+
    "\3\54\1\311\1\54\1\313\3\54\1\314\3\54\1\315"+
    "\3\54\1\316\1\317\1\54\1\320\1\311\3\54\2\311"+
    "\1\317\1\311\2\321\1\54\1\321\4\54\1\321\5\54"+
    "\1\321\10\54\1\321\1\54\1\21\1\321\3\54\4\321"+
    "\2\322\1\54\1\322\4\54\1\322\5\54\1\322\10\54"+
    "\1\322\1\54\1\21\1\322\3\54\4\322\23\54\1\323"+
    "\5\54\1\21\10\54\14\64\1\261\15\64\1\21\7\64"+
    "\2\324\1\64\1\324\1\325\3\64\1\324\1\64\1\326"+
    "\3\64\1\327\3\64\1\330\3\64\1\331\1\332\1\64"+
    "\1\324\1\320\3\64\2\324\1\332\1\324\2\333\1\64"+
    "\1\333\4\64\1\333\5\64\1\333\10\64\1\333\1\64"+
    "\1\333\1\21\3\64\4\333\2\334\1\64\1\334\4\64"+
    "\1\334\5\64\1\334\10\64\1\334\1\64\1\334\1\21"+
    "\3\64\4\334\23\64\1\335\6\64\1\21\7\64\14\0"+
    "\1\265\25\0\2\336\1\0\1\336\4\0\1\336\5\0"+
    "\1\336\10\0\1\336\1\0\2\336\3\0\4\336\2\337"+
    "\1\0\1\337\4\0\1\337\5\0\1\337\10\0\1\337"+
    "\1\0\2\337\3\0\4\337\10\0\1\340\4\0\1\341"+
    "\1\342\6\0\1\340\1\342\20\0\1\343\47\0\1\344"+
    "\33\0\1\345\2\0\1\340\4\0\1\341\1\342\6\0"+
    "\1\340\1\342\24\0\1\346\35\0\1\345\34\0\2\266"+
    "\1\0\1\266\1\267\3\0\1\347\1\0\1\270\2\0"+
    "\1\341\1\350\3\0\1\272\2\0\1\340\1\351\1\274"+
    "\1\0\2\266\3\0\2\266\1\274\1\266\14\0\1\352"+
    "\35\0\1\353\14\0\1\353\31\0\1\354\45\0\1\355"+
    "\25\0\1\356\50\0\1\357\36\0\1\360\35\0\1\361"+
    "\56\0\1\310\26\0\1\362\34\0\1\21\1\0\4\21"+
    "\1\0\5\21\1\0\10\21\1\0\1\21\2\0\3\21"+
    "\4\0\10\54\1\363\4\54\1\364\1\365\6\54\1\363"+
    "\1\365\2\54\1\21\15\54\1\366\23\54\1\21\23\54"+
    "\1\367\15\54\1\21\15\54\1\370\2\54\1\363\4\54"+
    "\1\364\1\365\6\54\1\363\1\365\2\54\1\21\21\54"+
    "\1\371\17\54\1\21\15\54\1\370\23\54\1\21\10\54"+
    "\2\311\1\54\1\311\1\312\3\54\1\372\1\54\1\313"+
    "\2\54\1\364\1\373\3\54\1\315\2\54\1\363\1\374"+
    "\1\317\1\54\1\320\1\311\3\54\2\311\1\317\1\311"+
    "\14\54\1\375\14\54\1\21\10\54\10\64\1\376\4\64"+
    "\1\377\1\u0100\6\64\1\376\1\u0100\3\64\1\21\14\64"+
    "\1\u0101\24\64\1\21\22\64\1\u0102\16\64\1\21\14\64"+
    "\1\u0103\2\64\1\376\4\64\1\377\1\u0100\6\64\1\376"+
    "\1\u0100\3\64\1\21\20\64\1\u0104\20\64\1\21\14\64"+
    "\1\u0103\24\64\1\21\7\64\2\324\1\64\1\324\1\325"+
    "\3\64\1\u0105\1\64\1\326\2\64\1\377\1\u0106\3\64"+
    "\1\330\2\64\1\376\1\u0107\1\332\1\64\1\324\1\320"+
    "\3\64\2\324\1\332\1\324\14\64\1\u0108\15\64\1\21"+
    "\7\64\4\0\1\u0109\46\0\1\u0109\44\0\1\u010a\33\0"+
    "\1\u010b\44\0\1\u010c\47\0\1\u010d\37\0\1\u010e\30\0"+
    "\1\u0109\3\0\1\340\4\0\1\341\1\342\6\0\1\340"+
    "\1\342\20\0\1\345\2\0\1\340\3\0\1\u010a\1\341"+
    "\1\342\6\0\1\340\1\342\20\0\1\345\6\0\1\u010a"+
    "\37\0\1\u010f\14\0\1\352\10\0\1\352\12\0\1\u0110"+
    "\35\0\1\u0111\56\0\1\357\26\0\1\u0112\40\0\1\310"+
    "\46\0\1\247\36\0\1\u0113\14\0\1\u0113\14\0\4\54"+
    "\1\u0114\24\54\1\21\21\54\1\u0114\17\54\1\21\24\54"+
    "\1\u0115\14\54\1\21\16\54\1\u0116\22\54\1\21\21\54"+
    "\1\u0117\17\54\1\21\27\54\1\u0118\11\54\1\21\25\54"+
    "\1\u0119\13\54\1\21\14\54\1\u0114\3\54\1\363\4\54"+
    "\1\364\1\365\6\54\1\363\1\365\2\54\1\21\15\54"+
    "\1\370\2\54\1\363\3\54\1\u0115\1\364\1\365\6\54"+
    "\1\363\1\365\2\54\1\21\15\54\1\370\6\54\1\u0115"+
    "\14\54\1\21\22\54\1\u011a\14\54\1\375\1\54\1\21"+
    "\6\54\1\375\1\54\4\64\1\u011b\25\64\1\21\20\64"+
    "\1\u011b\20\64\1\21\23\64\1\u011c\15\64\1\21\15\64"+
    "\1\u011d\23\64\1\21\20\64\1\u011e\20\64\1\21\26\64"+
    "\1\u011f\12\64\1\21\24\64\1\u0120\14\64\1\21\13\64"+
    "\1\u011b\3\64\1\376\4\64\1\377\1\u0100\6\64\1\376"+
    "\1\u0100\3\64\1\21\14\64\1\u0103\2\64\1\376\3\64"+
    "\1\u011c\1\377\1\u0100\6\64\1\376\1\u0100\3\64\1\21"+
    "\14\64\1\u0103\6\64\1\u011c\15\64\1\21\21\64\1\u0121"+
    "\14\64\1\u0108\2\64\1\21\5\64\1\u0108\1\64\2\u0122"+
    "\1\0\1\u0122\4\0\1\u0122\5\0\1\u0122\10\0\1\u0122"+
    "\1\0\2\u0122\3\0\4\u0122\23\0\1\u0123\20\0\1\u0124"+
    "\41\0\1\u0125\15\0\1\u0126\34\0\1\u0127\33\0\1\u0128"+
    "\47\0\1\u0129\34\0\1\357\46\0\1\303\36\0\1\u012a"+
    "\14\0\1\u012a\22\0\1\247\33\0\2\u012b\1\54\1\u012b"+
    "\4\54\1\u012b\5\54\1\u012b\10\54\1\u012b\1\54\1\21"+
    "\1\u012b\3\54\4\u012b\23\54\1\u012c\5\54\1\21\12\54"+
    "\1\u012d\26\54\1\21\12\54\1\u012e\15\54\1\u012f\10\54"+
    "\1\21\23\54\1\u0130\15\54\1\21\15\54\1\u0131\23\54"+
    "\1\21\23\54\1\u0132\15\54\1\21\10\54\2\u0133\1\64"+
    "\1\u0133\4\64\1\u0133\5\64\1\u0133\10\64\1\u0133\1\64"+
    "\1\u0133\1\21\3\64\4\u0133\23\64\1\u0134\6\64\1\21"+
    "\11\64\1\u0135\27\64\1\21\11\64\1\u0136\15\64\1\u0137"+
    "\11\64\1\21\22\64\1\u0138\16\64\1\21\14\64\1\u0139"+
    "\24\64\1\21\22\64\1\u013a\16\64\1\21\7\64\14\0"+
    "\1\u013b\34\0\1\u013c\46\0\1\u013d\40\0\1\u013e\37\0"+
    "\1\u013f\53\0\1\u0140\27\0\1\u0141\36\0\1\303\33\0"+
    "\14\54\1\u0142\14\54\1\21\17\54\1\u0143\21\54\1\21"+
    "\24\54\1\u0144\14\54\1\21\23\54\1\u0145\15\54\1\21"+
    "\21\54\1\u0146\17\54\1\21\33\54\1\u0147\5\54\1\21"+
    "\21\54\1\u0148\17\54\1\21\10\54\14\64\1\u0149\15\64"+
    "\1\21\16\64\1\u014a\22\64\1\21\23\64\1\u014b\15\64"+
    "\1\21\22\64\1\u014c\16\64\1\21\20\64\1\u014d\20\64"+
    "\1\21\32\64\1\u014e\6\64\1\21\20\64\1\u014f\20\64"+
    "\1\21\7\64\2\0\1\u0150\47\0\1\u0151\14\0\1\u0151"+
    "\31\0\1\u0152\45\0\1\u0153\25\0\1\u0154\50\0\1\u0122"+
    "\27\0\1\u0155\37\0\2\54\1\u0156\26\54\1\21\20\54"+
    "\1\u0157\14\54\1\u0157\3\54\1\21\25\54\1\u0158\13\54"+
    "\1\21\31\54\1\u0159\7\54\1\21\15\54\1\u015a\23\54"+
    "\1\21\24\54\1\u012b\14\54\1\21\12\54\1\u015b\26\54"+
    "\1\21\10\54\2\64\1\u015c\27\64\1\21\17\64\1\u015d"+
    "\14\64\1\u015d\4\64\1\21\24\64\1\u015e\14\64\1\21"+
    "\30\64\1\u015f\10\64\1\21\14\64\1\u0160\24\64\1\21"+
    "\23\64\1\u0133\15\64\1\21\11\64\1\u0161\27\64\1\21"+
    "\7\64\7\0\1\u0109\43\0\1\u0162\35\0\1\u0163\56\0"+
    "\1\u0122\26\0\1\u0164\46\0\1\u0165\25\0\7\54\1\u0114"+
    "\21\54\1\21\21\54\1\u0166\17\54\1\21\15\54\1\u0167"+
    "\23\54\1\21\32\54\1\u012b\6\54\1\21\17\54\1\u0168"+
    "\21\54\1\21\24\54\1\u0169\14\54\1\21\10\54\7\64"+
    "\1\u011b\22\64\1\21\20\64\1\u016a\20\64\1\21\14\64"+
    "\1\u016b\24\64\1\21\31\64\1\u0133\7\64\1\21\16\64"+
    "\1\u016c\22\64\1\21\23\64\1\u016d\15\64\1\21\7\64"+
    "\6\0\1\u0122\46\0\1\u0140\36\0\1\u016e\14\0\1\u016e"+
    "\31\0\1\u016f\24\0\6\54\1\u012b\22\54\1\21\23\54"+
    "\1\u0147\15\54\1\21\20\54\1\u0170\14\54\1\u0170\3\54"+
    "\1\21\25\54\1\u0171\13\54\1\21\10\54\6\64\1\u0133"+
    "\23\64\1\21\22\64\1\u014e\16\64\1\21\17\64\1\u0172"+
    "\14\64\1\u0172\4\64\1\21\24\64\1\u0173\14\64\1\21"+
    "\7\64\6\0\1\u0140\40\0\1\u0174\34\0\6\54\1\u0147"+
    "\22\54\1\21\15\54\1\u0175\23\54\1\21\10\54\6\64"+
    "\1\u014e\23\64\1\21\14\64\1\u0176\24\64\1\21\7\64"+
    "\13\0\1\163\26\0\13\54\1\205\15\54\1\21\10\54"+
    "\13\64\1\216\16\64\1\21\7\64";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11628];
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
    "\5\0\13\1\2\11\1\1\1\11\6\1\1\11\1\1"+
    "\44\0\7\1\51\0\1\11\3\0\1\11\15\0\1\1"+
    "\3\0\1\1\4\0\1\1\3\0\1\1\11\0\1\1"+
    "\16\0\2\1\4\0\1\1\14\0\1\1\1\11\12\0"+
    "\1\1\6\0\4\1\7\0\3\1\1\0\2\11\17\0"+
    "\1\1\62\0\1\11\10\0\1\1\7\0\1\1\103\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[374];
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
	/** Variable used to store violation location and variable involved. **/
	String location = "MAIN PROGRAM";
	/** Variable used to store file value and function values associated. **/
	/** List of string used to store if and do statements. **/
	List<String> identifiers = new LinkedList<String>();
	/** Integer to determine imbrication depth. **/
	int depth = 0;
	/** A boolean to found continuation line. **/
	boolean ampFound = false;
	
	public COMFLOWExitLoop() {
    }
	
	@Override
	public void setInputFile(IPath file) throws FileNotFoundException {
		super.setInputFile(file);
		this.zzReader = new FileReader(file.toOSString());
	}
	
	


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public COMFLOWExitLoop(java.io.Reader in) {
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
    while (i < 190) {
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
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
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
          { 	return getViolations();
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 15: break;
          case 2: 
            { yybegin(COMMENT);
            }
          case 16: break;
          case 3: 
            { yybegin(YYINITIAL);
            }
          case 17: break;
          case 4: 
            { throw new JFlexException( new Exception("Illegal character <" + yytext() + ">") );
            }
          case 18: break;
          case 5: 
            { location = location + " " + yytext();
							 yybegin(COMMENT);
            }
          case 19: break;
          case 6: 
            { if (!ampFound){
									yybegin(YYINITIAL);
								 }
								 ampFound = false;
            }
          case 20: break;
          case 7: 
            { ampFound = true;
            }
          case 21: break;
          case 8: 
            { yybegin(IFLINE);
            }
          case 22: break;
          case 9: 
            { identifiers.add("DO");
							 depth++;
            }
          case 23: break;
          case 10: 
            { if (!identifiers.isEmpty()) {
								int idLength = identifiers.size();
								if (identifiers.get(idLength-1).equals("DO")) {
									depth--;
								}
								identifiers.remove(idLength-1);
							 }
							 yybegin(COMMENT);
            }
          case 24: break;
          case 11: 
            { if (depth > 0) {
							 	this.setError(location,"There is more than one exit in the loop.", yyline + 1);
							 }
            }
          case 25: break;
          case 12: 
            { location = yytext(); 
							yybegin(NAMING);
            }
          case 26: break;
          case 13: 
            { identifiers.add("IF");
								 yybegin(AVOID);
            }
          case 27: break;
          case 14: 
            { this.setError(location,"There is more than one exit in the loop.", yyline + 1);
            }
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}