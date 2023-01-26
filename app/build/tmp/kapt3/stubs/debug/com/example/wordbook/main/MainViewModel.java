package com.example.wordbook.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0011\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0012J\u0011\u0010\u0017\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/wordbook/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_mStudyMovingState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/wordbook/main/MovingState;", "_mTestMovingState", "mStudyMovingState", "Landroidx/lifecycle/LiveData;", "getMStudyMovingState", "()Landroidx/lifecycle/LiveData;", "mTestMovingState", "getMTestMovingState", "repository", "Lcom/example/wordbook/repository/WordRepository;", "moveToStudy", "", "moveToStudyEnabled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moveToTest", "moveToTestEnabled", "setStudyMovingStateIdle", "setTestMovingStateIdle", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.wordbook.main.MainViewModel.Companion Companion = null;
    public static final int LIMIT_TO_MOVE_STUDY = 1;
    public static final int LIMIT_TO_MOVE_TEST = 4;
    private final com.example.wordbook.repository.WordRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.main.MovingState> _mStudyMovingState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.main.MovingState> _mTestMovingState = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wordbook.main.MovingState> getMStudyMovingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.wordbook.main.MovingState> getMTestMovingState() {
        return null;
    }
    
    public final void moveToStudy() {
    }
    
    public final void setStudyMovingStateIdle() {
    }
    
    public final void moveToTest() {
    }
    
    public final void setTestMovingStateIdle() {
    }
    
    private final java.lang.Object moveToStudyEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object moveToTestEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/wordbook/main/MainViewModel$Companion;", "", "()V", "LIMIT_TO_MOVE_STUDY", "", "LIMIT_TO_MOVE_TEST", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}