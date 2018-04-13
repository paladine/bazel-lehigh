maven_jar(name = "com_google_guava", artifact = "com.google.guava:guava:jar:24.1-jre")
maven_jar(name = "com_google_guava_testlib", artifact = "com.google.guava:guava-testlib:jar:24.1-jre")
maven_jar(name = "com_google_truth", artifact = "com.google.truth:truth:jar:0.40")
maven_jar(name = "junit", artifact = "junit:junit:jar:4.12")

git_repository(
    name = "org_pubref_rules_protobuf",
    remote = "https://github.com/pubref/rules_protobuf",
    #tag = "v0.8.1",
    commit = "1e42832fe73a7a15c33a96f31618e98a826447d5" # alternatively, latest commit on master
)
load("@org_pubref_rules_protobuf//java:rules.bzl", "java_proto_repositories")
java_proto_repositories(
#    excludes = [
#        "com_google_code_findbugs_jsr305",
#        "com_google_errorprone_error_prone_annotations",
#        "com_google_guava_guava",
#    ],
)

