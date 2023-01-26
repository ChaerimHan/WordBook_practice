package com.example.wordbook.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/wordbook/edit/EditVocaViewModelState;", "", "()V", "Loading", "Ready", "Lcom/example/wordbook/edit/EditVocaViewModelState$Loading;", "Lcom/example/wordbook/edit/EditVocaViewModelState$Ready;", "app_debug"})
public abstract class EditVocaViewModelState {
    
    private EditVocaViewModelState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/wordbook/edit/EditVocaViewModelState$Loading;", "Lcom/example/wordbook/edit/EditVocaViewModelState;", "()V", "app_debug"})
    public static final class Loading extends com.example.wordbook.edit.EditVocaViewModelState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.wordbook.edit.EditVocaViewModelState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/wordbook/edit/EditVocaViewModelState$Ready;", "Lcom/example/wordbook/edit/EditVocaViewModelState;", "word", "Lcom/example/wordbook/database/Word;", "(Lcom/example/wordbook/database/Word;)V", "getWord", "()Lcom/example/wordbook/database/Word;", "app_debug"})
    public static final class Ready extends com.example.wordbook.edit.EditVocaViewModelState {
        @org.jetbrains.annotations.NotNull()
        private final com.example.wordbook.database.Word word = null;
        
        public Ready(@org.jetbrains.annotations.NotNull()
        com.example.wordbook.database.Word word) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.wordbook.database.Word getWord() {
            return null;
        }
    }
}