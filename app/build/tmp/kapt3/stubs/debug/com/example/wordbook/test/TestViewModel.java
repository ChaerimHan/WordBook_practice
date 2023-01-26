package com.example.wordbook.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/wordbook/test/TestViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_mResultState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/wordbook/test/TestViewModel$ResultState;", "kotlin.jvm.PlatformType", "_mTestUnit", "Lcom/example/wordbook/test/TestViewModel$TestUnit;", "mResultState", "Landroidx/lifecycle/LiveData;", "getMResultState", "()Landroidx/lifecycle/LiveData;", "mTestUnit", "getMTestUnit", "repository", "Lcom/example/wordbook/repository/WordRepository;", "isCorrect", "", "candidateIdx", "", "loadNextTestUnit", "", "onClickCandidate", "Companion", "ResultState", "TestUnit", "app_debug"})
public final class TestViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.wordbook.test.TestViewModel.Companion Companion = null;
    private static final long DELAY_TIME_SHOWING_NEXT_TEST = 800L;
    private final com.example.wordbook.repository.WordRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.test.TestViewModel.TestUnit> _mTestUnit = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.test.TestViewModel.ResultState> _mResultState = null;
    
    public TestViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.TestUnit> getMTestUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.ResultState> getMResultState() {
        return null;
    }
    
    private final void loadNextTestUnit() {
    }
    
    public final void onClickCandidate(int candidateIdx) {
    }
    
    private final boolean isCorrect(int candidateIdx) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/example/wordbook/test/TestViewModel$TestUnit;", "", "question", "Lcom/example/wordbook/database/Word;", "candidates", "", "(Lcom/example/wordbook/database/Word;Ljava/util/List;)V", "getCandidates", "()Ljava/util/List;", "getQuestion", "()Lcom/example/wordbook/database/Word;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class TestUnit {
        @org.jetbrains.annotations.NotNull()
        private final com.example.wordbook.database.Word question = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.example.wordbook.database.Word> candidates = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.wordbook.test.TestViewModel.TestUnit copy(@org.jetbrains.annotations.NotNull()
        com.example.wordbook.database.Word question, @org.jetbrains.annotations.NotNull()
        java.util.List<com.example.wordbook.database.Word> candidates) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public TestUnit(@org.jetbrains.annotations.NotNull()
        com.example.wordbook.database.Word question, @org.jetbrains.annotations.NotNull()
        java.util.List<com.example.wordbook.database.Word> candidates) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.wordbook.database.Word component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.wordbook.database.Word getQuestion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.wordbook.database.Word> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.wordbook.database.Word> getCandidates() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/wordbook/test/TestViewModel$ResultState;", "", "(Ljava/lang/String;I)V", "NONE", "CORRECT", "WRONG", "app_debug"})
    public static enum ResultState {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ CORRECT /* = new CORRECT() */,
        /*public static final*/ WRONG /* = new WRONG() */;
        
        ResultState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/wordbook/test/TestViewModel$Companion;", "", "()V", "DELAY_TIME_SHOWING_NEXT_TEST", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}