package com.lionxxw.kqsystem.mapper;

import com.lionxxw.kqsystem.entity.User;
import com.lionxxw.kqsystem.entity.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kq_user
     *
     * @mbggenerated Thu Jul 07 15:28:55 CST 2016
     */
    int updateByPrimaryKey(User record);
}