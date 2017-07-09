package edu.scut.ibm.dao;

import edu.scut.ibm.bean.Spittle;

import java.util.List;

/**
 * Created by limin on 2017/5/3.
 */
public interface SpittleDao {

    List<Spittle> findSpittles(long max, int count);
}
