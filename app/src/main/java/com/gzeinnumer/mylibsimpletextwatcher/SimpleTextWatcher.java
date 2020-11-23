package com.gzeinnumer.mylibsimpletextwatcher;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class SimpleTextWatcher implements TextWatcher {


    public SimpleTextWatcher(TWBeforeTextChanged callBack) {
        this._callBackBTC = callBack;
    }

    public SimpleTextWatcher(TWnOnTextChanged callBack) {
        this._callBackOTC = callBack;
    }

    public SimpleTextWatcher(TWAfterTextChanged callBack) {
        this._callBackATC = callBack;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (_callBackBTC!=null)
            _callBackBTC.beforeTextChanged(s, start, count, after);
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (_callBackOTC!=null)
            _callBackOTC.onTextChanged(s, start, before, count);
    }

    @Override
    public void afterTextChanged(Editable s) {
        if (_callBackATC!=null)
            _callBackATC.afterTextChanged(s);
    }

    private TWBeforeTextChanged _callBackBTC;
    private TWnOnTextChanged _callBackOTC;
    private TWAfterTextChanged _callBackATC;

    interface TWBeforeTextChanged {
        void beforeTextChanged(CharSequence s, int start, int count, int after);
    }

    interface TWnOnTextChanged {
        void onTextChanged(CharSequence s, int start, int before, int count);
    }

    interface TWAfterTextChanged {
        void afterTextChanged(Editable s);
    }
}
