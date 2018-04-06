java_library(
  name = "lib",
  srcs = glob(["*.java"]),
  deps = ["@com_google_guava//jar"],
)

java_binary(
  name = "mavendeps",
  main_class = "com.example.mavendeps.Program",
  runtime_deps = [":lib"],
)
