Sublime 執行 Java 並可以中文顯示
<pre>
1. Tools > Build System > New Build System
{
    "shell_cmd": "javac -encoding utf-8 $file && java -Dfile.encoding=UTF-8 $file_base_name"
}

2. Save 存檔:
   檔名: JavaEXE.sublime-build
</pre>   
