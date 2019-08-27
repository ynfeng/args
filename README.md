# 命令行解析

用法

```
  Args args = new Args(Schema.of("l:boolean p:int u:string f:boolean"),
            ArgLine.of("-l -p 8080 -u root "));
        assertThat(args.argValue("l"), is(true));
        assertThat(args.argValue("p"), is(8080));
        assertThat(args.argValue("u"), is("root"));
        assertThat(args.argValue("f"), is(false));
```
