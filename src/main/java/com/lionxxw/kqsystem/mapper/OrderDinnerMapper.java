package com.lionxxw.kqsystem.mapper;

import com.lionxxw.kqsystem.entity.OrderDinner;
import com.lionxxw.kqsystem.entity.OrderDinnerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDinnerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int countByExample(OrderDinnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int deleteByExample(OrderDinnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int insert(OrderDinner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int insertSelective(OrderDinner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    List<OrderDinner> selectByExample(OrderDinnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    OrderDinner selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int updateByExampleSelective(@Param("record") OrderDinner record, @Param("example") OrderDinnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int updateByExample(@Param("record") OrderDinner record, @Param("example") OrderDinnerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int updateByPrimaryKeySelective(OrderDinner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_order_dinner
     *
     * @mbggenerated Wed Jul 27 14:34:59 CST 2016
     */
    int updateByPrimaryKey(OrderDinner record);
}