package com.xclz.openpylib.python;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class PyTool {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void unzipResource(Context context, String fname, File outputDir) throws IOException {
        ZipEntry zipEntry;
        ZipInputStream zipStream = new ZipInputStream(context.getAssets().open(fname));
        do {
            zipEntry = zipStream.getNextEntry();
            if (zipEntry != null) {
                File outputFile = new File(outputDir, zipEntry.getName());
                if (zipEntry.isDirectory()) {
                    if (!outputFile.exists())
                        outputFile.mkdirs();
                } else {
                    if (!outputFile.exists()) {
                        Objects.requireNonNull(outputFile.getParentFile()).mkdirs();
                        outputFile.createNewFile();
                    }
                    FileOutputStream outStream = new FileOutputStream(outputFile);
                    int length;
                    byte[] buffer = new byte[1024];
                    while ((length = zipStream.read(buffer)) != -1) {
                        outStream.write(buffer, 0, length);
                        outStream.flush();
                    }
                    outStream.close();
                }
            }
        } while (zipEntry != null);
        zipStream.close();
    }

}
