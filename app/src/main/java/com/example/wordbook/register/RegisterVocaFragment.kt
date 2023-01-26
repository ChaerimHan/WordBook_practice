package com.example.wordbook.register

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.databinding.FragmentRegisterVocaBinding
import com.example.wordbook.study.StudyFragment

class RegisterVocaFragment : Fragment() {

    companion object {
        fun newInstance() = RegisterVocaFragment()
    }


    private lateinit var binding: FragmentRegisterVocaBinding
    private lateinit var viewModel: RegisterVocaViewModel
    private lateinit var backPressCallback: OnBackPressedCallback



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_register_voca, container, false)
        viewModel = ViewModelProvider(this).get(RegisterVocaViewModel::class.java) //단어 저장


        binding.confirm.setOnClickListener {
            val english = binding.englishInput.text.toString()
            val means = binding.meansInput.text.toString()
            var str_cat=""

            if(binding.radioGroup.checkedRadioButtonId==R.id.toeicButton){
                str_cat=binding.toeicButton.text.toString()
            }
            if(binding.radioGroup.checkedRadioButtonId==R.id.toeflButton){
                str_cat=binding.toeflButton.text.toString()
            }
            if(binding.radioGroup.checkedRadioButtonId==R.id.gongsiButton){
                str_cat=binding.gongsiButton.text.toString()
            }
            if(binding.radioGroup.checkedRadioButtonId==R.id.suneungButton){
                str_cat=binding.suneungButton.text.toString()
            }
            if(binding.radioGroup.checkedRadioButtonId==R.id.etcButton){
                str_cat=binding.etcButton.text.toString()
            }

            viewModel.registerWord(Word.make(english, means,str_cat)) //카테고리도 db에 저장되도록 수정


            //intent 코드 넣어야하나?
            destroy()
        }




        return binding.root
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)

        requireActivity().onBackPressedDispatcher.addCallback(this, getBackPressCallback())
    }

    override fun onDetach() {
        super.onDetach()

        getBackPressCallback().remove()
    }

    private fun getBackPressCallback(): OnBackPressedCallback {
        if (!::backPressCallback.isInitialized) {
            backPressCallback = object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    destroy()
                }
            }
        }
        return backPressCallback
    } //뒤로가기

    private fun destroy() {
        parentFragmentManager.popBackStack()
    }



}