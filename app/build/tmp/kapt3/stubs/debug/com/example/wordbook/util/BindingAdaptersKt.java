package com.example.wordbook.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u001a\u0016\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u00a8\u0006\u0016"}, d2 = {"setEnglish", "", "Landroid/widget/TextView;", "word", "Lcom/example/wordbook/database/Word;", "setFirstCandidate", "item", "Lcom/example/wordbook/test/TestViewModel$TestUnit;", "setFourthCandidate", "setMeans", "setQuestionEnglish", "setResultState", "resultState", "Lcom/example/wordbook/test/TestViewModel$ResultState;", "setSecondCandidate", "setStudyEnglishVisibility", "studyType", "Lcom/example/wordbook/study/StudyViewModel$StudyType;", "setStudyMeansVisibility", "setStudyTypeButtonText", "Landroid/widget/Button;", "setThirdCandidate", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"english"})
    public static final void setEnglish(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setEnglish, @org.jetbrains.annotations.Nullable()
    com.example.wordbook.database.Word word) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"means"})
    public static final void setMeans(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setMeans, @org.jetbrains.annotations.Nullable()
    com.example.wordbook.database.Word word) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"studyEnglishVisibility"})
    public static final void setStudyEnglishVisibility(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setStudyEnglishVisibility, @org.jetbrains.annotations.NotNull()
    com.example.wordbook.study.StudyViewModel.StudyType studyType) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"studyMeansVisibility"})
    public static final void setStudyMeansVisibility(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setStudyMeansVisibility, @org.jetbrains.annotations.NotNull()
    com.example.wordbook.study.StudyViewModel.StudyType studyType) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"studyTypeButtonText"})
    public static final void setStudyTypeButtonText(@org.jetbrains.annotations.NotNull()
    android.widget.Button $this$setStudyTypeButtonText, @org.jetbrains.annotations.NotNull()
    com.example.wordbook.study.StudyViewModel.StudyType studyType) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"question"})
    public static final void setQuestionEnglish(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setQuestionEnglish, @org.jetbrains.annotations.Nullable()
    com.example.wordbook.test.TestViewModel.TestUnit item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"resultState"})
    public static final void setResultState(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setResultState, @org.jetbrains.annotations.Nullable()
    com.example.wordbook.test.TestViewModel.ResultState resultState) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"firstCandidate"})
    public static final void setFirstCandidate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFirstCandidate, @org.jetbrains.annotations.Nullable()
    com.example.wordbook.test.TestViewModel.TestUnit item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"secondCandidate"})
    public static final void setSecondCandidate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setSecondCandidate, @org.jetbrains.annotations.Nullable()
    com.example.wordbook.test.TestViewModel.TestUnit item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"thirdCandidate"})
    public static final void setThirdCandidate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setThirdCandidate, @org.jetbrains.annotations.Nullable()
    com.example.wordbook.test.TestViewModel.TestUnit item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"fourthCandidate"})
    public static final void setFourthCandidate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFourthCandidate, @org.jetbrains.annotations.Nullable()
    com.example.wordbook.test.TestViewModel.TestUnit item) {
    }
}