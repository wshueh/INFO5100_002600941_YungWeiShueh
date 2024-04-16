package org.example.my_final_project;

import java.io.File;
import java.io.IOException;


public interface ImageOperation {
    void performOperation(File input, File output, String format) throws IOException;
}


