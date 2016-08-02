package com.lionxxw.kqsystem.mapper;

import com.lionxxw.kqsystem.entity.OptionTemplate;
import com.lionxxw.kqsystem.entity.OptionTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OptionTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int countByExample(OptionTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int deleteByExample(OptionTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int insert(OptionTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int insertSelective(OptionTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    List<OptionTemplate> selectByExampleWithBLOBs(OptionTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    List<OptionTemplate> selectByExample(OptionTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    OptionTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int updateByExampleSelective(@Param("record") OptionTemplate record, @Param("example") OptionTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") OptionTemplate record, @Param("example") OptionTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int updateByExample(@Param("record") OptionTemplate record, @Param("example") OptionTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int updateByPrimaryKeySelective(OptionTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(OptionTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner_option_template
     *
     * @mbggenerated Tue Aug 02 10:38:02 CST 2016
     */
    int updateByPrimaryKey(OptionTemplate record);
}