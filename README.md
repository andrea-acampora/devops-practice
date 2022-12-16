- [x] Create a new public GitHub repository "devops-practice" (or really whatever you like), or pick an old project of yours with no build automation nor CI.
- [x] If you created a new repo, write a program in a JVM-compatible language of your pick (Java, Groovy, Scala, Kotlin).
- [x] Configure a build system to compile and run the program.
- [ ] Configure the git hooks to make sure that every commit message adheres to a convention (conventional commits are recommended).
- [ ] Configure a CI pipeline that compiles and executes the program on Linux.
- [ ] Create a build matrix for testing with multiple operating systems.
- [ ] Create an empty release job that runs only if the previous ones completed successfully.
- [ ] Configure the program for release on Maven Central. Use of dedicated plugins (e.g., https://github.com/DanySK/publish-on-central) is allowed.
- [ ] Make sure that you can upload and close the project on Maven Central.
- [ ] Make sure that you can upload and close the project on Maven Central *automatically*.
- [ ] Configure a new job, that runs in parallel with the ones that compile and test, which tests the upload and closure on central (dry-delivery).
- [ ] Make sure that the dry-delivery job runs only in case secrets are available (not on branch builds of forks, nor on pull request builds).
- [ ] Configure the branch protection on the default branch (whatever its name). No PR must be mergeable, unless the CI works, the branch is up to date, and there are no pending discussions.
- [ ] Configure [semantic release](https://github.com/semantic-release/semantic-release) to release on Central, following the commits convention you adopted.
- [ ] Make a first fully-automated release on Maven Central (if necessary, trick the bot by creating an empty commit with an appropriate message).
- [ ] Configure Renovate to propose updates via pull requests, auto-rebase-merging and auto-rebase-updating the PRs. If you have a centralized shareable configuration, you can reuse it.