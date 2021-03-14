package com.example.miwokapp;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokranslation;

    // Contructor to assign values
    public Word(String defaultWord, String miwokWord) {
        this.mDefaultTranslation = defaultWord;
        this.mMiwokranslation = miwokWord;
    }

    /**
     * To get the Miwok Word
     *
     * @return mMiwokranslation , this is the Miwok word
     */
    public String getMiwokTranslation() {
        return mMiwokranslation;
    }

    /**
     * To get the Default(English) Word
     *
     * @return mDefaultTranslation , this is the Default(English) word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
