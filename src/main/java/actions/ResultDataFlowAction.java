package actions;

import model.ResultData;
import parsers.GenericLazyMapParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResultDataFlowAction {

    public static ResultData readJsonToClass(File file) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert inputStream != null;
        return GenericLazyMapParser.parse(inputStream, ResultData.class);
    }
}
