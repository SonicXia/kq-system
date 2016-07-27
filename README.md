# kq-system
个人考勤日志系统
# 框架
  spring + spring mvc + mybatis 为主要框架<br>
  视图层使用freemarker进行页面渲染<br>
  数据库使用mysql<br>
  前端使用easyui框架<br>
#功能
  1.个人登录/个人注册<br>
  2.个人加班考勤录入/导出<br>
  3.个人工作日志录入/导出<br>
  4.富文本编辑器使用FCKeditor插件<br>
  5.图片上传基于jersey框架,实现应用服务器和图片服务器分离<br>
  
#新增部门点餐功能
  需求:<br>
    1.点餐负责人创建点餐,可直接发布,也可预览之后发布<br>
    2.部门人员,进行确认加班点餐,可选择今日菜单选项<br>
    3.现在点餐人员需在点餐前截止时间前点餐,可excel导出今日点餐名单.特殊情况,未点餐者,直接联系点餐负责人,点餐负责人可进行点餐补录操作<br>
    
  ps:每次点餐负责人创建点餐时,点餐选项,可从模板中选择,可以直接新建,新建的选择,自动保存在模板中
