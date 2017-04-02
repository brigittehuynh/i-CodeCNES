/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/*****************************************************************************/
/* This file is used to generate a rule checker for F90.DESIGN.Free rule. 	 */
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

import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;
import fr.cnes.analysis.tools.analyzer.datas.Violation;
import fr.cnes.analysis.tools.analyzer.exception.JFlexException;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/F90DESIGNFree.lex</tt>
 */
public class F90DESIGNFree extends AbstractRule {

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
    "\12\0\1\31\1\32\1\32\1\32\23\0\1\1\1\30\4\0\1\27"+
    "\10\0\12\26\7\0\1\20\1\16\1\5\1\14\1\13\1\2\1\17"+
    "\1\23\1\24\2\23\1\22\1\21\1\4\1\10\1\11\1\23\1\12"+
    "\1\25\1\6\1\3\5\23\4\0\1\26\1\0\1\20\1\16\1\5"+
    "\1\14\1\13\1\2\1\17\1\23\1\24\2\23\1\22\1\21\1\4"+
    "\1\10\1\11\1\23\1\12\1\25\1\6\1\3\5\23\12\0\1\32"+
    "\252\0\2\7\115\0\1\15\u1ea8\0\1\32\1\32\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\7\1\1\3\1\4\1\5\1\6"+
    "\14\5\7\0\7\5\5\0\7\5\6\0\10\5\6\0"+
    "\10\5\5\0\1\7\5\5\1\7\2\5\4\0\6\5"+
    "\1\0\1\5\1\10\2\5\1\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[114];
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
    "\0\0\0\33\0\66\0\121\0\154\0\207\0\207\0\242"+
    "\0\275\0\330\0\363\0\u010e\0\u0129\0\u0144\0\207\0\207"+
    "\0\207\0\u015f\0\u017a\0\u0195\0\u01b0\0\u01cb\0\u01e6\0\u0201"+
    "\0\u021c\0\u0237\0\275\0\363\0\u0129\0\u0144\0\u0252\0\u026d"+
    "\0\u0288\0\u02a3\0\u02be\0\u0129\0\u0144\0\u02d9\0\u02f4\0\u030f"+
    "\0\u032a\0\u0345\0\u0360\0\u037b\0\u0396\0\u03b1\0\u03cc\0\u03e7"+
    "\0\u0402\0\u041d\0\u0438\0\u0453\0\u046e\0\u0489\0\u04a4\0\u04bf"+
    "\0\u04da\0\u04f5\0\u0510\0\u052b\0\u0546\0\u0561\0\u057c\0\u0597"+
    "\0\u05b2\0\u05cd\0\u05e8\0\u0603\0\u061e\0\u0639\0\u0654\0\u066f"+
    "\0\u068a\0\u06a5\0\u06c0\0\u06db\0\u06f6\0\u0711\0\u072c\0\u0747"+
    "\0\u0762\0\u077d\0\u0798\0\u07b3\0\u07ce\0\u07e9\0\u0804\0\u081f"+
    "\0\u083a\0\207\0\u0855\0\u0870\0\u088b\0\u08a6\0\u08c1\0\u0195"+
    "\0\u08dc\0\u08f7\0\u0912\0\u092d\0\u0948\0\u0963\0\u097e\0\u0999"+
    "\0\u09b4\0\u09cf\0\u09ea\0\u0a05\0\u0a20\0\u0a3b\0\u0195\0\u0a56"+
    "\0\u0a71\0\u0195";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[114];
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
    "\1\6\1\7\1\10\4\6\1\11\1\6\1\12\3\6"+
    "\1\13\3\6\1\14\2\6\1\11\1\13\1\6\1\15"+
    "\1\16\1\17\1\20\1\21\1\7\27\21\1\17\1\20"+
    "\1\21\1\7\5\22\1\21\5\22\1\21\10\22\3\21"+
    "\1\17\1\20\1\6\1\7\1\23\4\24\1\11\1\24"+
    "\1\25\2\24\1\26\1\13\2\24\1\27\1\30\2\24"+
    "\1\31\1\32\1\6\1\15\1\16\1\21\1\20\1\21"+
    "\1\7\1\23\4\24\1\33\1\24\1\25\2\24\1\26"+
    "\1\34\2\24\1\27\1\30\2\24\1\31\1\32\1\21"+
    "\1\35\1\36\1\17\1\20\36\0\1\37\33\0\1\40"+
    "\40\0\1\41\23\0\1\42\37\0\1\43\22\0\27\44"+
    "\1\6\3\44\30\45\1\6\2\45\2\0\5\22\1\0"+
    "\5\22\1\0\11\22\6\0\1\24\1\46\3\24\1\0"+
    "\5\24\1\0\11\24\6\0\5\24\1\0\5\24\1\0"+
    "\11\24\6\0\5\24\1\0\2\24\1\47\2\24\1\0"+
    "\11\24\6\0\5\24\1\0\3\24\1\50\1\24\1\0"+
    "\11\24\6\0\5\24\1\0\5\24\1\0\4\24\1\51"+
    "\4\24\6\0\5\24\1\0\1\52\4\24\1\0\11\24"+
    "\6\0\2\24\1\53\2\24\1\0\5\24\1\0\11\24"+
    "\6\0\1\24\1\54\3\24\1\0\5\24\1\0\11\24"+
    "\10\0\1\55\34\0\1\56\34\0\1\57\40\0\1\60"+
    "\30\0\1\61\20\0\2\24\1\62\2\24\1\0\5\24"+
    "\1\0\11\24\6\0\5\24\1\0\1\63\4\24\1\0"+
    "\11\24\6\0\5\24\1\0\5\24\1\0\2\24\1\64"+
    "\6\24\6\0\5\24\1\0\5\24\1\0\4\24\1\65"+
    "\4\24\6\0\5\24\1\0\4\24\1\66\1\0\11\24"+
    "\6\0\4\24\1\67\1\0\5\24\1\0\11\24\6\0"+
    "\5\24\1\0\5\24\1\0\1\70\10\24\11\0\1\71"+
    "\40\0\1\72\24\0\1\73\11\0\1\74\25\0\1\75"+
    "\23\0\1\76\31\0\3\24\1\77\1\24\1\0\5\24"+
    "\1\0\11\24\6\0\3\24\1\100\1\24\1\0\5\24"+
    "\1\0\1\24\1\101\7\24\6\0\5\24\1\0\5\24"+
    "\1\0\4\24\1\102\4\24\6\0\5\24\1\0\1\103"+
    "\4\24\1\0\11\24\6\0\1\24\1\104\3\24\1\0"+
    "\5\24\1\0\11\24\6\0\5\24\1\0\3\24\1\105"+
    "\1\24\1\0\11\24\6\0\5\24\1\0\2\24\1\106"+
    "\2\24\1\0\11\24\12\0\1\107\36\0\1\110\33\0"+
    "\1\111\31\0\1\112\30\0\1\113\44\0\1\114\12\0"+
    "\4\24\1\115\1\0\5\24\1\0\11\24\6\0\5\24"+
    "\1\0\3\24\1\116\1\24\1\0\11\24\6\0\5\24"+
    "\1\0\2\24\1\117\2\24\1\0\11\24\6\0\5\24"+
    "\1\0\5\24\1\0\4\24\1\120\4\24\6\0\3\24"+
    "\1\121\1\24\1\0\5\24\1\0\11\24\6\0\5\24"+
    "\1\0\5\24\1\0\4\24\1\122\4\24\6\0\5\24"+
    "\1\0\2\24\1\123\2\24\1\0\11\24\6\0\5\24"+
    "\1\0\1\124\4\24\1\0\11\24\13\0\1\125\14\0"+
    "\1\125\10\0\1\126\44\0\1\127\36\0\1\130\15\0"+
    "\1\131\42\0\1\132\21\0\5\24\1\125\5\24\1\0"+
    "\6\24\1\133\2\24\6\0\5\24\1\0\4\24\1\134"+
    "\1\0\11\24\6\0\5\24\1\0\5\24\1\0\2\24"+
    "\1\135\6\24\6\0\5\24\1\0\1\136\4\24\1\0"+
    "\11\24\6\0\5\24\1\0\5\24\1\0\2\24\1\137"+
    "\6\24\6\0\5\24\1\0\3\24\1\140\1\24\1\0"+
    "\11\24\6\0\1\141\4\24\1\0\5\24\1\0\11\24"+
    "\6\0\1\24\1\142\3\24\1\0\5\24\1\0\11\24"+
    "\14\0\1\143\42\0\1\144\15\0\1\145\50\0\1\132"+
    "\17\0\1\146\26\0\5\24\1\0\1\147\4\24\1\0"+
    "\11\24\6\0\1\24\1\150\3\24\1\0\5\24\1\0"+
    "\11\24\6\0\5\24\1\0\5\24\1\0\3\24\1\140"+
    "\5\24\6\0\3\24\1\151\1\24\1\0\5\24\1\0"+
    "\11\24\6\0\4\24\1\152\1\0\5\24\1\0\11\24"+
    "\6\0\5\24\1\0\5\24\1\0\2\24\1\153\6\24"+
    "\6\0\4\24\1\154\1\0\5\24\1\0\11\24\10\0"+
    "\1\132\33\0\1\114\37\0\1\114\27\0\1\155\14\0"+
    "\1\155\10\0\2\24\1\140\2\24\1\0\5\24\1\0"+
    "\11\24\6\0\5\24\1\0\2\24\1\122\2\24\1\0"+
    "\11\24\6\0\5\24\1\0\5\24\1\0\2\24\1\156"+
    "\6\24\6\0\5\24\1\0\3\24\1\157\1\24\1\0"+
    "\11\24\6\0\3\24\1\122\1\24\1\0\5\24\1\0"+
    "\11\24\6\0\5\24\1\155\5\24\1\0\6\24\1\160"+
    "\2\24\10\0\1\114\30\0\4\24\1\161\1\0\5\24"+
    "\1\0\11\24\6\0\2\24\1\122\2\24\1\0\5\24"+
    "\1\0\11\24\6\0\5\24\1\0\3\24\1\162\1\24"+
    "\1\0\11\24\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2700];
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
    "\5\0\2\11\7\1\3\11\15\1\7\0\7\1\5\0"+
    "\7\1\6\0\10\1\6\0\10\1\5\0\1\11\10\1"+
    "\4\0\6\1\1\0\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[114];
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
 	List<Violation> list = new LinkedList<Violation>();
 	String alloc = "";
	
	public F90DESIGNFree() {
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
  public F90DESIGNFree(java.io.Reader in) {
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
    while (i < 168) {
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
          {  return getViolations(); 
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
            { location = location + " " + yytext();  yybegin(COMMENT);
            }
          case 15: break;
          case 7: 
            { location = yytext(); yybegin(NAMING);
            }
          case 16: break;
          case 8: 
            { alloc=location.split(" ")[0];
            }
          case 17: break;
          case 9: 
            { if(!location.contains(alloc)) this.setError(location,"ALLOCATE and DEALLOCATE  are not in the same algorithmic level", yyline+1);
            }
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
