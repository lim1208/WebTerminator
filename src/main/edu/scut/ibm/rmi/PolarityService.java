package edu.scut.ibm.rmi;

import java.util.List;

/**
 * Created by limin on 2017/5/9.
 */
public interface PolarityService {
    double polarity(String sentence);

    double polarity(List<String> sentences);
}
