echo;
echo;

echo 开始提交代码到本地仓库
echo 当前目录是：%cd%

echo;
echo;
echo 开始识别当前git的版本
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
git --version
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
echo;
echo;

echo 开始添加变更
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
git add -A .
echo 执行结束！
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

echo;
echo;
echo;
echo;
echo;
echo;
echo;
echo;
echo 提交变更到本地仓库
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

set /p var=请输入提交说明: 
echo;
echo 您输入的提交说明为：  #1
echo;
git commit -m %var%
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

echo;
echo;
echo;
echo;
echo;
echo;
echo;
echo;
echo 将变更情况提交到远程git服务器
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
git push origin master
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

echo;
echo 批处理执行完毕！
echo;

pause
