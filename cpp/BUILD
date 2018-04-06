cc_library(
  name = "lib",
  srcs = ["library.cc"],
  hdrs = ["library.h"],
)

cc_binary(
  name = "cpp",
  srcs = ["main.cc"],
  deps = [":lib"],
)
