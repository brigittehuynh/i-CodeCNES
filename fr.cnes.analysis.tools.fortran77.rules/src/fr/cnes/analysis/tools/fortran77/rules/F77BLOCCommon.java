/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/*****************************************************************************/
/* This file is used to generate a rule checker for F77.BLOC.Common rule.    */
/* For further information on this, we advise you to refer to RNC manuals.	 */
/* As many comments have been done on the ExampleRule.lex file, this file    */
/* will restrain its comments on modifications.								 */
/*																			 */
/*****************************************************************************/

package fr.cnes.analysis.tools.fortran77.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import java.util.logging.Logger;

import org.eclipse.core.runtime.IPath;

import fr.cnes.analysis.tools.analyzer.exception.JFlexException;
import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;import fr.cnes.analysis.tools.analyzer.datas.Violation;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/F77BLOCCommon.lex</tt>
 */
public class F77BLOCCommon extends AbstractRule {

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
    "\12\0\1\52\1\53\1\53\1\53\23\0\1\1\1\50\4\0\1\47"+
    "\2\0\1\4\4\0\1\51\12\46\7\0\1\36\1\32\1\3\1\24"+
    "\1\23\1\5\1\35\1\45\1\11\2\45\1\43\1\37\1\7\1\12"+
    "\1\21\1\45\1\22\1\31\1\10\1\6\5\45\4\0\1\46\1\0"+
    "\1\41\1\34\1\2\1\30\1\27\1\13\1\40\1\45\1\17\2\45"+
    "\1\44\1\42\1\15\1\20\1\25\1\45\1\26\1\33\1\16\1\14"+
    "\5\45\12\0\1\53\u1fa2\0\1\53\1\53\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\3\3\12\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\3\13\12\12\14\6\1\14"+
    "\13\0\1\15\14\0\1\16\174\0\1\17\11\0\1\20"+
    "\11\0\1\21\1\22\6\0\1\23\6\0\1\24\14\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[250];
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
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\334\0\u0108"+
    "\0\u0134\0\334\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c"+
    "\0\u0268\0\u0294\0\u02c0\0\u02ec\0\334\0\334\0\334\0\334"+
    "\0\u0318\0\334\0\334\0\u0344\0\u0370\0\334\0\u039c\0\u03c8"+
    "\0\u03f4\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528"+
    "\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688"+
    "\0\u06b4\0\u06e0\0\u070c\0\u0738\0\334\0\u0764\0\u0790\0\u07bc"+
    "\0\u07e8\0\u0814\0\u0840\0\u086c\0\u0898\0\u08c4\0\u08f0\0\u02c0"+
    "\0\334\0\u02ec\0\u091c\0\u0948\0\u0974\0\u09a0\0\u09cc\0\u09f8"+
    "\0\u0a24\0\u0a50\0\u0a7c\0\u0aa8\0\u04fc\0\334\0\u0528\0\u0ad4"+
    "\0\u0b00\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc\0\u0c08\0\u0c34"+
    "\0\u0c60\0\u070c\0\u0738\0\u0c8c\0\u0cb8\0\u0ce4\0\u0d10\0\u0d3c"+
    "\0\u0d68\0\u0d94\0\u0dc0\0\u0dec\0\u0e18\0\u0e44\0\u0e70\0\u0e9c"+
    "\0\u0ec8\0\u0ef4\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\u0ffc"+
    "\0\u1028\0\u1054\0\u1080\0\u10ac\0\u10d8\0\u1104\0\u1130\0\u115c"+
    "\0\u1188\0\u11b4\0\u11e0\0\u120c\0\u1238\0\u1264\0\u1290\0\u12bc"+
    "\0\u12e8\0\u1314\0\u1340\0\u136c\0\u1398\0\u13c4\0\u13f0\0\u141c"+
    "\0\u1448\0\u1474\0\u14a0\0\u14cc\0\u14f8\0\u1524\0\u1550\0\u157c"+
    "\0\u15a8\0\u15d4\0\u1600\0\u162c\0\u1658\0\u1684\0\u16b0\0\u16dc"+
    "\0\u1708\0\u1734\0\u1760\0\u178c\0\u17b8\0\u17e4\0\u1810\0\u183c"+
    "\0\u1868\0\u1894\0\u18c0\0\u18ec\0\u1918\0\u1944\0\u1970\0\u199c"+
    "\0\u19c8\0\u19f4\0\u1a20\0\u1a4c\0\u1a78\0\u1aa4\0\u1ad0\0\u1afc"+
    "\0\u1b28\0\u1b54\0\u1b80\0\u1bac\0\u1bd8\0\u1c04\0\u1c30\0\u1c5c"+
    "\0\u1c88\0\u1cb4\0\u1ce0\0\u1d0c\0\u1d38\0\u1d64\0\u1d90\0\u1dbc"+
    "\0\u1de8\0\u1e14\0\u1e40\0\u1e6c\0\u1e98\0\u1ec4\0\u1ef0\0\u1f1c"+
    "\0\u1f48\0\u1f74\0\334\0\u1fa0\0\u1fcc\0\u1ff8\0\u2024\0\u2050"+
    "\0\u207c\0\u20a8\0\u20d4\0\u2100\0\334\0\u212c\0\u2158\0\u2184"+
    "\0\u21b0\0\u21dc\0\u2208\0\u2234\0\u2260\0\u228c\0\334\0\334"+
    "\0\u22b8\0\u22e4\0\u2310\0\u233c\0\u2368\0\u2394\0\334\0\u23c0"+
    "\0\u23ec\0\u2418\0\u2444\0\u2470\0\u249c\0\334\0\u24c8\0\u24f4"+
    "\0\u2520\0\u254c\0\u2578\0\u25a4\0\u25d0\0\u25fc\0\u2628\0\u2654"+
    "\0\u2680\0\u26ac";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[250];
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
    "\1\6\1\7\1\10\1\11\1\12\1\13\5\6\1\14"+
    "\5\6\1\15\3\6\1\16\3\6\1\17\1\6\1\20"+
    "\3\6\1\21\2\6\1\22\4\6\1\23\1\24\1\6"+
    "\1\25\1\26\1\27\1\7\50\27\1\30\1\26\1\27"+
    "\1\7\2\31\1\27\41\31\4\27\1\32\1\26\1\33"+
    "\1\7\1\34\1\35\1\36\1\37\5\33\1\40\5\33"+
    "\1\41\3\33\1\42\3\33\1\43\1\33\1\44\3\33"+
    "\1\45\2\33\1\46\4\33\1\47\1\50\1\33\1\27"+
    "\1\26\1\27\1\7\1\51\1\52\1\27\1\53\5\27"+
    "\1\54\5\27\1\55\3\27\1\56\3\27\1\57\1\27"+
    "\1\60\3\27\1\61\2\27\1\62\4\27\1\63\1\64"+
    "\1\27\1\65\1\26\74\0\1\66\45\0\1\67\47\0"+
    "\1\70\61\0\1\71\61\0\1\72\57\0\1\73\33\0"+
    "\1\74\61\0\1\75\51\0\1\76\61\0\1\77\33\0"+
    "\47\100\1\101\4\100\50\102\1\101\3\102\2\0\2\31"+
    "\1\0\42\31\25\0\1\103\45\0\1\104\47\0\1\105"+
    "\61\0\1\106\61\0\1\107\57\0\1\110\33\0\1\111"+
    "\61\0\1\112\51\0\1\113\61\0\1\114\33\0\47\115"+
    "\1\116\4\115\50\117\1\116\3\117\20\0\1\120\45\0"+
    "\1\121\47\0\1\122\61\0\1\123\61\0\1\124\57\0"+
    "\1\125\33\0\1\126\61\0\1\127\51\0\1\130\61\0"+
    "\1\131\33\0\47\132\1\27\4\132\50\133\1\27\3\133"+
    "\42\0\1\134\50\0\1\135\23\0\1\136\61\0\1\137"+
    "\50\0\1\140\61\0\1\141\65\0\1\142\55\0\1\143"+
    "\43\0\1\144\57\0\1\145\65\0\1\146\50\0\1\147"+
    "\23\0\1\150\61\0\1\151\50\0\1\152\61\0\1\153"+
    "\65\0\1\154\55\0\1\155\43\0\1\156\57\0\1\157"+
    "\65\0\1\160\50\0\1\161\23\0\1\162\61\0\1\163"+
    "\50\0\1\164\61\0\1\165\65\0\1\166\55\0\1\167"+
    "\43\0\1\170\57\0\1\171\65\0\1\172\50\0\1\173"+
    "\17\0\1\174\52\0\1\175\54\0\1\176\31\0\1\177"+
    "\20\0\1\200\35\0\1\201\35\0\1\202\57\0\1\203"+
    "\33\0\1\204\61\0\1\205\101\0\1\206\50\0\1\207"+
    "\17\0\1\210\52\0\1\211\54\0\1\212\31\0\1\213"+
    "\20\0\1\214\35\0\1\215\35\0\1\216\57\0\1\217"+
    "\33\0\1\220\61\0\1\221\101\0\1\222\50\0\1\223"+
    "\17\0\1\224\52\0\1\225\54\0\1\226\31\0\1\227"+
    "\20\0\1\230\35\0\1\231\35\0\1\232\57\0\1\233"+
    "\33\0\1\234\61\0\1\235\57\0\1\236\45\0\1\237"+
    "\51\0\1\240\61\0\1\241\60\0\1\242\52\0\1\243"+
    "\60\0\1\244\52\0\1\245\37\0\1\246\61\0\1\247"+
    "\76\0\1\250\54\0\1\251\27\0\1\252\45\0\1\253"+
    "\51\0\1\254\61\0\1\255\60\0\1\256\52\0\1\257"+
    "\60\0\1\260\52\0\1\261\37\0\1\262\61\0\1\263"+
    "\76\0\1\264\54\0\1\265\27\0\1\266\45\0\1\267"+
    "\51\0\1\270\61\0\1\271\60\0\1\272\52\0\1\273"+
    "\60\0\1\274\52\0\1\275\37\0\1\276\61\0\1\277"+
    "\76\0\1\300\54\0\1\301\24\0\1\302\45\0\1\302"+
    "\55\0\1\303\61\0\1\304\60\0\1\305\65\0\1\306"+
    "\45\0\1\307\64\0\1\310\20\0\1\311\61\0\1\312"+
    "\62\0\1\313\57\0\1\313\41\0\1\314\45\0\1\314"+
    "\55\0\1\315\61\0\1\316\60\0\1\317\65\0\1\320"+
    "\45\0\1\321\64\0\1\322\20\0\1\323\61\0\1\324"+
    "\62\0\1\325\57\0\1\325\41\0\1\326\45\0\1\326"+
    "\55\0\1\327\61\0\1\330\60\0\1\331\65\0\1\332"+
    "\45\0\1\333\64\0\1\334\20\0\1\335\61\0\1\336"+
    "\62\0\1\337\57\0\1\337\24\0\51\302\1\0\1\340"+
    "\1\302\12\0\1\341\61\0\1\342\41\0\1\343\104\0"+
    "\1\313\30\0\1\344\101\0\1\313\21\0\1\345\61\0"+
    "\1\346\35\0\51\314\1\0\1\347\1\314\12\0\1\350"+
    "\61\0\1\351\41\0\1\352\104\0\1\325\30\0\1\353"+
    "\101\0\1\325\21\0\1\354\61\0\1\355\35\0\51\326"+
    "\1\0\1\356\1\326\12\0\1\357\61\0\1\360\41\0"+
    "\1\361\104\0\1\337\30\0\1\362\101\0\1\337\21\0"+
    "\1\363\61\0\1\364\44\0\1\313\61\0\1\313\60\0"+
    "\1\250\57\0\1\251\36\0\1\365\61\0\1\366\43\0"+
    "\1\325\61\0\1\325\60\0\1\264\57\0\1\265\36\0"+
    "\1\367\61\0\1\370\43\0\1\337\61\0\1\337\60\0"+
    "\1\300\57\0\1\301\36\0\1\371\61\0\1\372\43\0"+
    "\1\250\61\0\1\251\45\0\1\264\61\0\1\265\45\0"+
    "\1\300\61\0\1\301\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9944];
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
    "\5\0\2\11\2\1\1\11\12\1\4\11\1\1\2\11"+
    "\2\1\1\11\26\1\1\11\13\0\1\11\14\0\1\11"+
    "\174\0\1\11\11\0\1\11\11\0\2\11\6\0\1\11"+
    "\6\0\1\11\14\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[250];
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
    private static final Logger LOGGER = Logger.getLogger(F77BLOCCommon.class.getName());

	String location = "MAIN PROGRAM"; 
    String parsedFileName;
	
	
	public F77BLOCCommon() {
    }
	
	@Override
	public void setInputFile(IPath file) throws FileNotFoundException {
		super.setInputFile(file);
        LOGGER.finest("begin method setInputFile");
        this.parsedFileName = file.toString();
        this.zzReader = new FileReader(file.toOSString());
        LOGGER.finest("end method setInputFile");
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public F77BLOCCommon(java.io.Reader in) {
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
    while (i < 166) {
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
          { return getViolations();
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - YYINITIAL -> LINE (Transition : . )");
                                    yybegin(LINE);
            }
          case 21: break;
          case 2: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - [ALL] -> COMMENT (Transition : FREE_COMMENT \""+yytext()+"\" )");
				                    yybegin(COMMENT);
            }
          case 22: break;
          case 3: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - YYINITIAL -> COMMENT (Transition : COMMENT_WORD \""+yytext()+"\" )");
                                    yybegin(COMMENT);
            }
          case 23: break;
          case 4: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - YYINITIAL -> NEW_LINE (Transition : \\n )");
                                    yybegin(NEW_LINE);
            }
          case 24: break;
          case 5: 
            { String errorMessage = "Class"+this.getClass().getName()+"\nIllegal character <" + yytext() + ">\nFile :"+ this.parsedFileName+"\nat line:"+(yyline+1)+" column:"+yycolumn;
                                    throw new JFlexException(new Exception(errorMessage));
            }
          case 25: break;
          case 6: 
            { 
            }
          case 26: break;
          case 7: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - COMMENT -> NEW_LINE (Transition : \\n )");
                                    yybegin(NEW_LINE);
            }
          case 27: break;
          case 8: 
            { location = location + " " + yytext();
                                    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NAMING -> COMMENT (Transition : VAR \""+yytext()+"\" )");
                                    yybegin(COMMENT);
            }
          case 28: break;
          case 9: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NAMING -> NEW_LINE (Transition : \\n )");
                                    yybegin(NEW_LINE);
            }
          case 29: break;
          case 10: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NEW_LINE -> LINE (Transition : . )");
                                    yybegin(LINE);
            }
          case 30: break;
          case 11: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NEW_LINE -> COMMENT (Transition : COMMENT_WORD \""+yytext()+"\" )");
                                    yybegin(COMMENT);
            }
          case 31: break;
          case 12: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - LINE -> NEW_LINE (Transition : \\n )");
                                    yybegin(NEW_LINE);
            }
          case 32: break;
          case 13: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - YYINITIAL -> LINE (Transition : STRING \""+yytext()+"\" )");
                                    yybegin(LINE);
            }
          case 33: break;
          case 14: 
            { LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NEW_LINE -> LINE (Transition : STRING \""+yytext()+"\" )");
                                    yybegin(LINE);
            }
          case 34: break;
          case 15: 
            { location = yytext();
								 LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - YYINITIAL -> NAMING (Transition : TYPE \""+yytext()+"\" )");
								 yybegin(NAMING);
            }
          case 35: break;
          case 16: 
            { location = yytext();
								    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NEW_LINE -> NAMING (Transition : TYPE \""+yytext()+"\" )");
								    yybegin(NAMING);
            }
          case 36: break;
          case 17: 
            { location = yytext();
								    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - LINE -> NAMING (Transition : TYPE \""+yytext()+"\" )");
								    yybegin(NAMING);
            }
          case 37: break;
          case 18: 
            { LOGGER.fine("Setting error line "+(yyline+1)+" because of the unnamed COMMON is not allowed..");
                                    this.setError(location,"Unnamed COMMON is not allowed.", yyline + 1);
								    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - YYINITIAL -> NEW_LINE (Transition : RULE_WORD \""+yytext()+"\" )");
								    yybegin(NEW_LINE);
            }
          case 38: break;
          case 19: 
            { LOGGER.fine("Setting error line "+(yyline+1)+" because of the unnamed COMMON is not allowed..");
                                    this.setError(location,"Unnamed COMMON is not allowed.", yyline + 1);
								    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NEW_LINE -> NEW_LINE (Transition : RULE_WORD \""+yytext()+"\" )");
								    yybegin(NEW_LINE);
            }
          case 39: break;
          case 20: 
            { LOGGER.fine("Setting error line "+(yyline+1)+" because of the unnamed COMMON is not allowed..");
                                    this.setError(location,"Unnamed COMMON is not allowed.", yyline + 1);
								    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - LINE -> NEW_LINE (Transition : RULE_WORD \""+yytext()+"\" )");
								    yybegin(NEW_LINE);
            }
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
