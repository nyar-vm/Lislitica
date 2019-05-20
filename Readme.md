# Lislitica



## Different Operators

| Name        | Lislitica  | Mathematica     | Remark              |
| :---------- | :--------- | :-------------- | :------------------ |
| Function    | `f(x)`     | `f[x]`          |                     |
| Part        | `[1]`      | `[[1]]`         | Indexed             |
| Span        | `[1:2]`    | `[[1;;2]]`      | Slice               |
| Association | `{a:True}` | `<|"a"->True|>` | Dictionary          |
| Curry       | `a.b`      | `a["b"]`        | Prototype           |
| Dot         | `a ⋅ b`    | `a.b`           | CenterDot(`U+22C5`) |


## Different functions

| Lislitica | Mathematica            | Remark                            |
| :-------- | :--------------------- | :-------------------------------- |
| Scope     | GeneralUtilities`Scope |
| Raw       | ToExpression           | Translate to Mathematica Directly |


```Mathematica
Cases({{1, 2, 3}, a, {4, 5}}, t : {__Integer} :> t^2)
```

```Mathematica
Keys({a: x, b: y, c: z})
```

area(square) ^= s^2

assoc.b = w


prop(a, b(c)) ^= value;


### Weak Postfix

```Mathematica
b + a.?Sin  =>  b + Sin(a)
b + a//Sin  =>  Sin(b + a)
```





```
Plot(
    Sin(Sqrt(2)x) + Sin(x), {x, 0, 50}, 
    MeshFunctions: {mf},
    Mesh: {{0}},
    MeshStyle: Directive(PointSize(Medium), Red)
)
```


### StringJoin

```
StringJoin("abc", ABC, 123)
```

```
StringJoin[ToString /@ {"abc" <> ABC <> 123}]
```