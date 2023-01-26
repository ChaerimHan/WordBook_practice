package com.example.wordbook.study;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u0006\u0010\u001f\u001a\u00020\u001cR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\n0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/wordbook/study/StudyViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_studyType", "Lcom/example/wordbook/study/StudyViewModel$StudyType;", "_word", "Lcom/example/wordbook/database/Word;", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "idx", "", "repository", "Lcom/example/wordbook/repository/WordRepository;", "studyType", "getStudyType", "word", "getWord", "words", "", "loadNextWord", "", "loadPreviousWord", "loadWords", "setNextStudyType", "StudyType", "app_debug"})
public final class StudyViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.wordbook.repository.WordRepository repository = null;
    private java.util.List<com.example.wordbook.database.Word> words;
    private int idx = 0;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.study.StudyViewModel.StudyType> _studyType = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.database.Word> _word = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _error = null;
    
    public StudyViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wordbook.study.StudyViewModel.StudyType> getStudyType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wordbook.database.Word> getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getError() {
        return null;
    }
    
    private final void loadWords() {
    }
    
    public final void loadNextWord() {
    }
    
    public final void loadPreviousWord() {
    }
    
    public final void setNextStudyType() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/wordbook/study/StudyViewModel$StudyType;", "", "(Ljava/lang/String;I)V", "BOTH", "ONLY_ENGLISH", "ONLY_KOREAN", "app_debug"})
    public static enum StudyType {
        /*public static final*/ BOTH /* = new BOTH() */,
        /*public static final*/ ONLY_ENGLISH /* = new ONLY_ENGLISH() */,
        /*public static final*/ ONLY_KOREAN /* = new ONLY_KOREAN() */;
        
        StudyType() {
        }
    }
}