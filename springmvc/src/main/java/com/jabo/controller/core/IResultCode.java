package com.jabo.controller.core;

import java.io.Serializable;

public interface IResultCode extends Serializable {

    String getMessage();

    int getCode();
}

