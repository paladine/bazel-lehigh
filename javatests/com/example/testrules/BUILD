load(":gen_java_tests.bzl", "gen_java_tests")

java_library(
  name = "tests",
  srcs = glob(["*.java"]),
  deps = [
    "@com_google_guava//jar",
    "@com_google_truth//jar",
    "@junit//jar",
  ],
)

gen_java_tests(
  srcs = glob(["*.java"]),
  runtime_deps = [":tests"],
)

