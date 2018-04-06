java_library(
  name = "lib",
  srcs = glob(["*.java"]),
  deps = [
      "@com_google_guava//jar",
      "//proto:events_proto",
      "//proto:events_proto_compile_imports",
  ],
  visibility = ["//javatests/com/example/tests:__pkg__"],
)

java_binary(
  name = "proto",
  main_class = "com.example.proto.Program",
  runtime_deps = [":lib"],
)
