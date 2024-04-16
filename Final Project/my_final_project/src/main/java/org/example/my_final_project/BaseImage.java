package org.example.my_final_project;

import java.io.File;
import java.io.IOException;

public abstract class BaseImage implements ImageOperation {
    public abstract void performOperation(File input, File output, String format) throws IOException;
}

