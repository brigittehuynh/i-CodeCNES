/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/********************************************************************************/
/* This file is used to generate a rule checker for COM.INST.LoopCondition rule.*/
/* For further information on this, we advise you to refer to RNC manuals.	    */
/* As many comments have been done on the ExampleRule.lex file, this file       */
/* will restrain its comments on modifications.								    */
/*                                                                              */
/********************************************************************************/

package fr.cnes.analysis.tools.fortran77.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import java.util.logging.Logger;

import org.eclipse.core.runtime.IPath;

import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;import fr.cnes.analysis.tools.analyzer.datas.Violation;
import fr.cnes.analysis.tools.analyzer.exception.JFlexException;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/COMINSTLoopCondition.lex</tt>
 */
public class COMINSTLoopCondition extends AbstractRule {

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
  public static final int LOOP = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\61\1\62\1\62\1\62\22\0\1\51\1\1\6\0\1\52"+
    "\1\63\1\4\3\0\1\53\1\0\12\60\2\0\1\56\1\55\1\56"+
    "\2\0\1\36\1\32\1\3\1\24\1\23\1\5\1\35\1\46\1\11"+
    "\2\57\1\43\1\37\1\7\1\12\1\21\1\54\1\22\1\31\1\10"+
    "\1\6\1\57\1\45\3\57\4\0\1\60\1\0\1\41\1\34\1\2"+
    "\1\30\1\27\1\13\1\40\1\50\1\17\2\57\1\44\1\42\1\15"+
    "\1\20\1\25\1\57\1\26\1\33\1\16\1\14\1\57\1\47\3\57"+
    "\12\0\1\62\u1fa2\0\1\62\1\62\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\1\2\1\3\10\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\12\12\12\6\1\14"+
    "\1\2\1\15\1\6\1\16\1\6\1\17\34\0\1\16"+
    "\153\0\1\20\10\0\1\21\1\22\10\0\1\23\1\24"+
    "\30\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[233];
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
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u0138"+
    "\0\u0138\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4"+
    "\0\u02d8\0\u0138\0\u0138\0\u0138\0\u0138\0\u030c\0\u0138\0\u0138"+
    "\0\u0138\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\u0618"+
    "\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0138\0\u0750\0\u0138"+
    "\0\u0784\0\u0750\0\u07b8\0\u0138\0\u07ec\0\u0820\0\u0854\0\u0888"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28"+
    "\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8"+
    "\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68"+
    "\0\u0138\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4"+
    "\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074"+
    "\0\u10a8\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214"+
    "\0\u1248\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4"+
    "\0\u13e8\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554"+
    "\0\u1588\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4"+
    "\0\u1728\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860\0\u1894"+
    "\0\u18c8\0\u18fc\0\u1930\0\u1964\0\u1998\0\u19cc\0\u1a00\0\u1a34"+
    "\0\u1a68\0\u1a9c\0\u1ad0\0\u1b04\0\u1b38\0\u1b6c\0\u1ba0\0\u1bd4"+
    "\0\u1c08\0\u1c3c\0\u1c70\0\u1ca4\0\u1cd8\0\u1d0c\0\u1d40\0\u1d74"+
    "\0\u1da8\0\u1ddc\0\u1e10\0\u1e44\0\u1e78\0\u1eac\0\u1ee0\0\u1f14"+
    "\0\u1f48\0\u1f7c\0\u1fb0\0\u1fe4\0\u2018\0\u204c\0\u2080\0\u20b4"+
    "\0\u20e8\0\u211c\0\u2150\0\u2184\0\u21b8\0\u21ec\0\u2220\0\u2254"+
    "\0\u2288\0\u22bc\0\u22f0\0\u2324\0\u0138\0\u2358\0\u238c\0\u23c0"+
    "\0\u23f4\0\u2428\0\u245c\0\u2490\0\u24c4\0\u0138\0\u0138\0\u24f8"+
    "\0\u252c\0\u2560\0\u2594\0\u25c8\0\u25fc\0\u2630\0\u2664\0\u0138"+
    "\0\u0138\0\u2698\0\u26cc\0\u2700\0\u2734\0\u2768\0\u279c\0\u27d0"+
    "\0\u2804\0\u2838\0\u286c\0\u28a0\0\u28d4\0\u2908\0\u293c\0\u2970"+
    "\0\u29a4\0\u29d8\0\u2a0c\0\u2a40\0\u2a74\0\u2aa8\0\u2adc\0\u2b10"+
    "\0\u2b44";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[233];
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
    "\1\7\1\10\3\11\1\12\5\7\1\13\5\7\1\14"+
    "\3\7\1\15\3\7\1\16\1\7\1\17\3\7\1\20"+
    "\2\7\1\21\16\7\1\22\1\23\1\7\1\24\1\10"+
    "\57\24\1\25\1\23\2\24\1\10\2\26\1\24\44\26"+
    "\3\24\1\26\2\24\1\26\1\24\1\27\1\23\1\24"+
    "\1\30\1\10\3\31\1\32\5\30\1\33\5\30\1\34"+
    "\3\30\1\35\3\30\1\36\1\30\1\37\3\30\1\40"+
    "\2\30\1\41\2\30\1\42\1\30\1\43\11\30\1\24"+
    "\1\23\1\30\1\24\1\10\3\24\1\44\5\24\1\45"+
    "\5\24\1\46\3\24\1\47\3\24\1\50\1\24\1\51"+
    "\3\24\1\52\2\24\1\53\2\24\1\54\1\24\1\55"+
    "\11\24\1\56\1\23\2\24\1\57\50\24\1\60\1\61"+
    "\1\24\1\62\1\63\3\24\1\23\1\64\72\0\1\65"+
    "\71\0\1\66\71\0\1\67\67\0\1\70\43\0\1\71"+
    "\71\0\1\72\61\0\1\73\71\0\1\74\45\0\2\26"+
    "\1\0\44\26\3\0\1\26\2\0\2\26\11\0\1\75"+
    "\71\0\1\76\71\0\1\77\67\0\1\100\43\0\1\101"+
    "\71\0\1\102\61\0\1\103\71\0\1\104\111\0\1\105"+
    "\65\0\1\106\21\0\1\107\71\0\1\110\71\0\1\111"+
    "\67\0\1\112\43\0\1\113\71\0\1\114\61\0\1\115"+
    "\71\0\1\116\111\0\1\117\65\0\1\120\70\0\1\121"+
    "\15\0\1\122\13\0\1\123\11\0\1\124\5\0\1\124"+
    "\75\0\1\24\15\0\1\125\71\0\1\126\60\0\1\127"+
    "\71\0\1\130\75\0\1\131\65\0\1\132\53\0\1\133"+
    "\67\0\1\134\42\0\1\135\71\0\1\136\60\0\1\137"+
    "\71\0\1\140\75\0\1\141\65\0\1\142\53\0\1\143"+
    "\67\0\1\144\44\0\1\145\71\0\1\146\53\0\1\147"+
    "\71\0\1\150\60\0\1\151\71\0\1\152\75\0\1\153"+
    "\65\0\1\154\53\0\1\155\67\0\1\156\44\0\1\157"+
    "\71\0\1\160\67\0\1\161\114\0\1\161\17\0\1\162"+
    "\12\0\1\162\43\0\1\163\62\0\1\164\64\0\1\165"+
    "\31\0\1\166\30\0\1\167\35\0\1\170\45\0\1\171"+
    "\67\0\1\172\43\0\1\173\71\0\1\174\52\0\1\175"+
    "\62\0\1\176\64\0\1\177\31\0\1\200\30\0\1\201"+
    "\35\0\1\202\45\0\1\203\67\0\1\204\43\0\1\205"+
    "\71\0\1\206\112\0\1\207\64\0\1\210\22\0\1\211"+
    "\62\0\1\212\64\0\1\213\31\0\1\214\30\0\1\215"+
    "\35\0\1\216\45\0\1\217\67\0\1\220\43\0\1\221"+
    "\71\0\1\222\112\0\1\223\64\0\1\224\72\0\1\121"+
    "\63\0\1\24\20\0\1\225\71\0\1\226\70\0\1\227"+
    "\62\0\1\230\70\0\1\231\62\0\1\232\47\0\1\233"+
    "\71\0\1\234\106\0\1\235\64\0\1\236\27\0\1\237"+
    "\71\0\1\240\70\0\1\241\62\0\1\242\70\0\1\243"+
    "\62\0\1\244\47\0\1\245\71\0\1\246\106\0\1\247"+
    "\64\0\1\250\42\0\1\251\67\0\1\251\44\0\1\252"+
    "\71\0\1\253\70\0\1\254\62\0\1\255\70\0\1\256"+
    "\62\0\1\257\47\0\1\260\71\0\1\261\106\0\1\262"+
    "\64\0\1\263\42\0\1\264\67\0\1\264\45\0\1\265"+
    "\71\0\1\266\70\0\1\267\75\0\1\270\55\0\1\271"+
    "\74\0\1\272\30\0\1\273\71\0\1\274\72\0\1\275"+
    "\67\0\1\275\45\0\1\276\71\0\1\277\70\0\1\300"+
    "\75\0\1\301\55\0\1\302\74\0\1\303\30\0\1\304"+
    "\71\0\1\305\72\0\1\306\67\0\1\306\105\0\1\251"+
    "\1\307\22\0\1\310\71\0\1\311\70\0\1\312\75\0"+
    "\1\313\55\0\1\314\74\0\1\315\30\0\1\316\71\0"+
    "\1\317\72\0\1\320\67\0\1\320\105\0\1\264\1\321"+
    "\23\0\1\322\71\0\1\323\51\0\1\324\114\0\1\275"+
    "\40\0\1\325\111\0\1\275\31\0\1\326\71\0\1\327"+
    "\57\0\1\330\71\0\1\331\51\0\1\332\114\0\1\306"+
    "\40\0\1\333\111\0\1\306\31\0\1\334\71\0\1\335"+
    "\57\0\1\336\71\0\1\337\51\0\1\340\114\0\1\320"+
    "\40\0\1\341\111\0\1\320\31\0\1\342\71\0\1\343"+
    "\54\0\1\275\71\0\1\275\70\0\1\235\67\0\1\236"+
    "\46\0\1\344\71\0\1\345\53\0\1\306\71\0\1\306"+
    "\70\0\1\247\67\0\1\250\46\0\1\346\71\0\1\347"+
    "\53\0\1\320\71\0\1\320\70\0\1\262\67\0\1\263"+
    "\46\0\1\350\71\0\1\351\53\0\1\235\71\0\1\236"+
    "\55\0\1\247\71\0\1\250\55\0\1\262\71\0\1\263"+
    "\46\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11128];
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
    "\6\0\3\11\10\1\4\11\1\1\3\11\24\1\1\11"+
    "\1\1\1\11\3\1\1\11\34\0\1\11\153\0\1\11"+
    "\10\0\2\11\10\0\2\11\30\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[233];
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
    private static final Logger LOGGER = Logger.getLogger(COMINSTLoopCondition.class.getName());
	String location = "MAIN PROGRAM";
    String parsedFileName;
	
	int par = 0;
	
	public COMINSTLoopCondition(){
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
  public COMINSTLoopCondition(java.io.Reader in) {
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
    while (i < 184) {
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
            { par++;
            }
          case 33: break;
          case 14: 
            { LOGGER.fine("Setting error line "+(yyline+1)+" because loop condition shall not be written with equality or difference (==,!=).");
                                    setError(location,"A loop condition shall not be written with equality or difference (==,!=).", yyline+1); 
								    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - LOOP -> LINE (COND_ERROR : \\n )");
								    yybegin(LINE);
            }
          case 34: break;
          case 15: 
            { par--;
                                    if(par==0){
                                        LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - LOOP -> LINE (Transition : [)] )");
                                        yybegin(LINE);
                                    }
            }
          case 35: break;
          case 16: 
            { location = yytext();
                                    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - YYINITIAL -> NAMING (Transition : TYPE \""+yytext()+"\" )");
                                    yybegin(NAMING);
            }
          case 36: break;
          case 17: 
            { location = yytext();
                                    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NEW_LINE -> NAMING (Transition : TYPE \""+yytext()+"\" )");
                                    yybegin(NAMING);
            }
          case 37: break;
          case 18: 
            { par = 1;
                                    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - NEW_LINE -> LOOP (Transition : WHILE_LOOP \""+yytext()+"\" )");
                                    yybegin(LOOP);
            }
          case 38: break;
          case 19: 
            { location = yytext();
                                    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - LINE -> NAMING (Transition : TYPE \""+yytext()+"\" )");
                                    yybegin(NAMING);
            }
          case 39: break;
          case 20: 
            { par = 1;
                                    LOGGER.fine("["+this.parsedFileName+":"+(yyline+1)+":"+yycolumn+"] - LINE -> LOOP (Transition : WHILE_LOOP \""+yytext()+"\" )");
                                    yybegin(LOOP);
            }
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
