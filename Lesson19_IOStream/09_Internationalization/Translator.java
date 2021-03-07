package edu.ucalgary.ensf409;

  /* getTranslation()
   * getter method
  */

  /* translate()
   * Accepts a month number (e.g., 1 for January), a day number (e.g., 31 for
   * the 31st), and a year. Throws an IllegalArgumentException if monthNum or dayNum is 
   * not valid. Returns the formatted sentence as a String. Notice that the String
   * containing formatting uses numbered arguments - this is because some languages
   * will put the words in the sentence in a different order, but the translate()
   * method must be able to work without knowledge of the language structure.
  */

  /* Constructor
   * Accepts a String of a two-letter language code, dash, and two-letter country
   * code, e.g., te-in and throws an IllegalArgumentException if the language and
   * country code are not in the correct format. Language codes are ISO 639-1 and
   * country codes are ISO 3166, but this method only checks the format of the String, 
   * not the validity of the codes. It calls importTranslation().
  */

  /* importTranslation()
   * Calls deserialize() if the appropriate file exists, otherwise calls importFromText().
  */

  /* importFromText()
   * Reads in from a the two-letter language code, dash, two-letter country code text 
   * file, in the form of ab-xy.txt, and instantiates a TranslationText object with
   * the data. It can throw I/O exceptions, as well as a custom ArgFileNotFoundException. 
   * We expect the .txt file to be in a valid format. The file is expected to be in the same 
   * directory. The file en-us.txt is an example of a valid .txt file. It will always consist
   * of the month names, one per line, followed by the day names, one per line, followed by
   * the sentence containing formatting strings. This is the last line in the file. You
   * cannot make any assumptions about what will appear on each line, only that each line
   * will contain only one data element, and that it will not contain an empty line.
  */

  /* serialize()
  * Creates a serialized object file of the TranslationText object, with the
  * name format la-co.ser, where la is the two-letter language code and co is
  * the two-letter country code. An example of a serialized object file can be
  * found in the exercise directory as es-bo.ser
  * I/O exceptions can be thrown.
  */

  /* deserialize()
   * Creates a TranslationText object from a .ser file. The files are named
   * xx-yy.ser, where xx is the two-letter language code and yy is the two-
   * letter country code. es-bo.ser is an example. It can throw I/O exceptions.
  */

