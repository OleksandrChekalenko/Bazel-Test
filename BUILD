java_binary(
    name = "App",
    srcs = ["src/main/java/com/example/App.java"],
    main_class = "com.example.App",
    deps = [":combinatorics"],
)

java_library(
    name = "combinatorics",
    srcs = ["src/main/java/com/example/Combinatorics.java"],
    visibility = ["//src/main/java/com/example/cmdline:__pkg__"],
)
