package me.bakumon.moneykeeper.datasource;

import java.util.List;

import io.reactivex.Flowable;
import me.bakumon.moneykeeper.database.entity.Record;
import me.bakumon.moneykeeper.database.entity.RecordType;
import me.bakumon.moneykeeper.database.entity.RecordWithType;

/**
 * 数据源
 *
 * @author Bakumon https://bakumon.me
 */
public interface AppDataSource {
    /**
     * 获取所有记账类型数据
     *
     * @return 所有记账类型数据
     */
    Flowable<List<RecordType>> getAllRecordType();

    /**
     * 批量新增记账类型
     *
     * @param recordTypes 记账类型数组
     */
    void insertAllRecordType(RecordType... recordTypes);

    /**
     * 初始化默认的记账类型
     */
    void initRecordTypes();

    /**
     * 获取当前月份的记账记录数据
     *
     * @return 当前月份的记录数据的 Flowable 对象
     */
    Flowable<List<RecordWithType>> getCurrentMonthRecordWithTypes();

    /**
     * 新增一条记账记录
     *
     * @param record 记账记录实体
     */
    void insertRecord(Record record);
}