/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/*****************************************************************************/
/* This file is used to generate a rule checker for F77TYPEHollerith rule.	 */
/* For further information on this, we advise you to refer to RNC manuals.	 */
/* As many comments have been done on the ExampleRule.lex file, this file    */
/* will restrain its comments on modifications.								 */
/*																			 */
/*****************************************************************************/

package fr.cnes.analysis.tools.fortran77.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.eclipse.core.runtime.IPath;

import fr.cnes.analysis.tools.analyzer.exception.JFlexException;
import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;import fr.cnes.analysis.tools.analyzer.datas.Violation;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/F77TYPEHollerith.lex</tt>
 */
public class F77TYPEHollerith extends AbstractRule {

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
    "\11\0\1\55\1\56\1\57\1\57\1\57\22\0\1\55\1\1\1\50"+
    "\4\0\1\47\2\0\1\4\5\0\1\52\11\51\7\0\1\36\1\32"+
    "\1\3\1\24\1\23\1\5\1\35\1\54\1\11\2\45\1\43\1\37"+
    "\1\7\1\12\1\21\1\45\1\22\1\31\1\10\1\6\5\45\4\0"+
    "\1\46\1\0\1\41\1\34\1\2\1\30\1\27\1\13\1\40\1\54"+
    "\1\17\2\45\1\44\1\42\1\15\1\20\1\25\1\45\1\26\1\33"+
    "\1\16\1\14\5\45\1\0\1\53\10\0\1\57\u1fa2\0\1\57\1\57"+
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
    "\5\0\1\1\1\2\13\1\1\3\1\4\1\5\1\6"+
    "\1\2\14\5\14\0\10\5\14\0\1\7\10\5\1\10"+
    "\12\0\12\5\12\0\12\5\10\0\1\11\10\5\1\11"+
    "\6\0\6\5\2\0\2\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\360\0\u0120"+
    "\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0"+
    "\0\u02d0\0\u0300\0\360\0\360\0\360\0\u0330\0\u0360\0\u0390"+
    "\0\u0360\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0"+
    "\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660"+
    "\0\u0690\0\u06c0\0\u06f0\0\u02a0\0\u02d0\0\u0300\0\u0720\0\u0750"+
    "\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0\0\u0510"+
    "\0\u0540\0\u0570\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0"+
    "\0\u09f0\0\u0a20\0\u0a50\0\u0720\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10"+
    "\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u08d0\0\u0c00\0\u0c30\0\u0c60"+
    "\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0"+
    "\0\u0e10\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60"+
    "\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\u10b0\0\u10e0"+
    "\0\u1110\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\u1260"+
    "\0\u1290\0\u12c0\0\u12f0\0\u1320\0\u1350\0\u1380\0\u13b0\0\u13e0"+
    "\0\u1410\0\u1440\0\u1470\0\u14a0\0\u14d0\0\360\0\u1500\0\u1530"+
    "\0\u1560\0\u1590\0\u15c0\0\u15f0\0\u1620\0\u1650\0\u0360\0\u1680"+
    "\0\u16b0\0\u16e0\0\u1710\0\u1740\0\u1770\0\u17a0\0\u17d0\0\u1800"+
    "\0\u1830\0\u1860\0\u1890\0\u18c0\0\u18f0\0\u1920\0\u1950";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
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
    "\1\6\4\7\1\10\5\6\1\11\5\6\1\12\3\6"+
    "\1\13\3\6\1\14\1\6\1\15\3\6\1\16\2\6"+
    "\1\17\4\6\1\20\1\21\1\22\4\6\1\23\1\24"+
    "\1\25\1\7\54\25\1\23\1\24\1\25\1\7\2\26"+
    "\1\25\41\26\6\25\1\26\1\25\1\23\1\24\1\6"+
    "\1\7\2\27\1\7\1\30\5\31\1\32\5\31\1\33"+
    "\3\31\1\34\3\31\1\35\1\31\1\36\3\31\1\37"+
    "\2\31\1\40\3\31\1\6\1\20\1\21\1\22\2\6"+
    "\1\31\1\6\1\25\1\24\1\25\1\7\2\31\1\25"+
    "\1\30\5\31\1\32\5\31\1\33\3\31\1\34\3\31"+
    "\1\35\1\31\1\36\3\31\1\37\2\31\1\40\3\31"+
    "\1\25\1\41\1\42\1\43\2\25\1\31\1\25\1\23"+
    "\1\24\66\0\1\44\65\0\1\45\65\0\1\46\63\0"+
    "\1\47\37\0\1\50\65\0\1\51\55\0\1\52\65\0"+
    "\1\53\37\0\47\54\1\6\10\54\50\55\1\6\7\55"+
    "\51\0\2\56\2\57\5\0\2\26\1\0\42\26\2\0"+
    "\2\26\1\0\1\26\5\0\2\31\1\0\42\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\1\31\1\60"+
    "\40\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\7\31\1\61\32\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\15\31\1\62\24\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\21\31\1\63\20\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\1\31\1\64"+
    "\40\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\7\31\1\65\32\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\5\31\1\66\34\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\13\31\1\67\26\31\2\0"+
    "\2\31\1\0\1\31\3\0\47\70\1\25\10\70\50\71"+
    "\1\25\7\71\51\0\2\72\2\73\12\0\1\74\65\0"+
    "\1\75\54\0\1\76\65\0\1\77\71\0\1\100\61\0"+
    "\1\101\47\0\1\102\63\0\1\103\31\0\2\104\1\0"+
    "\41\104\6\0\2\104\4\0\2\31\1\0\2\31\1\105"+
    "\37\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\10\31\1\106\31\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\5\31\1\107\34\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\13\31\1\110\26\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\25\31\1\111"+
    "\14\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\27\31\1\112\12\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\17\31\1\113\22\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\23\31\1\114\16\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\115\1\0\41\115\6\0"+
    "\2\115\5\0\1\116\56\0\1\117\60\0\1\120\31\0"+
    "\1\121\24\0\1\122\35\0\1\123\41\0\1\124\63\0"+
    "\1\125\37\0\1\126\65\0\1\127\45\0\1\31\1\130"+
    "\1\0\42\31\2\0\2\31\1\0\1\31\5\0\1\131"+
    "\1\31\1\0\42\31\2\0\2\31\1\0\1\31\5\0"+
    "\1\31\1\132\1\0\30\31\1\133\11\31\2\0\2\31"+
    "\1\0\1\31\5\0\1\134\1\31\1\0\33\31\1\135"+
    "\6\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\15\31\1\136\24\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\21\31\1\137\20\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\1\31\1\140\40\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\7\31\1\141"+
    "\32\31\2\0\2\31\1\0\1\31\13\0\1\142\65\0"+
    "\1\143\64\0\1\144\56\0\1\145\64\0\1\146\56\0"+
    "\1\147\43\0\1\150\65\0\1\151\102\0\1\152\60\0"+
    "\1\153\15\0\2\31\1\0\3\31\1\154\36\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\11\31\1\155"+
    "\30\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\16\31\1\156\23\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\15\31\1\157\24\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\22\31\1\160\17\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\21\31\1\161"+
    "\20\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\5\31\1\162\34\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\13\31\1\163\26\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\36\31\1\164\3\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\37\31\1\165"+
    "\2\31\2\0\2\31\1\0\1\31\14\0\1\166\65\0"+
    "\1\167\64\0\1\170\71\0\1\171\51\0\1\172\70\0"+
    "\1\173\24\0\1\174\65\0\1\175\66\0\1\176\63\0"+
    "\1\176\32\0\2\31\1\0\4\31\1\177\35\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\12\31\1\200"+
    "\27\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\17\31\1\201\22\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\31\31\1\202\10\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\23\31\1\203\16\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\34\31\1\204"+
    "\5\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\1\31\1\205\40\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\7\31\1\206\32\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\16\31\1\207\23\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\22\31\1\207"+
    "\17\31\2\0\2\31\1\0\1\31\15\0\1\210\65\0"+
    "\1\211\45\0\1\212\110\0\1\176\34\0\1\213\105\0"+
    "\1\176\25\0\1\214\65\0\1\215\43\0\2\31\1\0"+
    "\5\31\1\216\34\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\13\31\1\217\26\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\1\31\1\220\40\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\32\31\1\207"+
    "\7\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\7\31\1\221\32\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\35\31\1\207\4\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\3\31\1\222\36\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\11\31\1\223"+
    "\30\31\2\0\2\31\1\0\1\31\12\0\1\176\65\0"+
    "\1\176\64\0\1\152\63\0\1\153\42\0\1\224\65\0"+
    "\1\225\42\0\2\31\1\0\2\31\1\207\37\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\10\31\1\207"+
    "\31\31\2\0\2\31\1\0\1\31\5\0\2\31\1\0"+
    "\15\31\1\164\24\31\2\0\2\31\1\0\1\31\5\0"+
    "\2\31\1\0\21\31\1\165\20\31\2\0\2\31\1\0"+
    "\1\31\5\0\2\31\1\0\4\31\1\226\35\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\12\31\1\227"+
    "\27\31\2\0\2\31\1\0\1\31\12\0\1\152\65\0"+
    "\1\153\44\0\2\31\1\0\2\31\1\164\37\31\2\0"+
    "\2\31\1\0\1\31\5\0\2\31\1\0\10\31\1\165"+
    "\31\31\2\0\2\31\1\0\1\31\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6528];
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
    "\5\0\2\11\13\1\3\11\16\1\14\0\10\1\14\0"+
    "\12\1\12\0\12\1\12\0\12\1\10\0\1\11\11\1"+
    "\6\0\6\1\2\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
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
	
	
	public F77TYPEHollerith() {
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
  public F77TYPEHollerith(java.io.Reader in) {
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
    while (i < 174) {
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
          {     return getViolations();
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(LINE);
            }
          case 10: break;
          case 2: 
            { yybegin(COMMENT);
            }
          case 11: break;
          case 3: 
            { yybegin(NEW_LINE);
            }
          case 12: break;
          case 4: 
            { throw new JFlexException( new Exception("Illegal character <" + yytext() + ">") );
            }
          case 13: break;
          case 5: 
            { 
            }
          case 14: break;
          case 6: 
            { location = location + " " + yytext();
								 yybegin(COMMENT);
            }
          case 15: break;
          case 7: 
            { this.setError(location,"Type Hollerith is not allowed. " + yytext() + "shall be a CHARACTER.", yyline + 1);
								 yybegin(LINE);
            }
          case 16: break;
          case 8: 
            { this.setError(location,"Type Hollerith is not allowed. " + yytext() + "shall be a CHARACTER.", yyline + 1);
            }
          case 17: break;
          case 9: 
            { location = yytext();
								 yybegin(NAMING);
            }
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
