package com.smktelkommlg.praktikumfragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    private PageViewModel pageViewModel;
    public FirstFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types of parameters
    public static FirstFragment newInstance(){
        return new FirstFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        TextInputEditText nameEditText = view.findViewById(R.id.textInputTextName);
        TextInputEditText addressEditText = view.findViewById(R.id.textInputTextAddress);

        //Add Text Watcher on name input text
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setName((charSequence.toString()));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        addressEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setName((charSequence.toString()));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}