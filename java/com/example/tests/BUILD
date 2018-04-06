java_library(
  name = "lib",
  srcs = glob(["*.java"]),
  deps = ["@com_google_guava//jar"],
  visibility = ["//javatests/com/example/tests:__pkg__"],
)

java_binary(
  name = "tests",
  main_class = "com.example.tests.Program",
  runtime_deps = [":lib"],
)
