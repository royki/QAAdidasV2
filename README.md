### Steps to follow

- `git clone https://github.com/royki/QAAdidasV2.git`

#### _Checkout API Branch_
- `git checkout apiAdidas`
    - _Run the testsuite in Local_
        - `cd apiAdidas`
        - `mvn clean test`
    - _Check the testsuite result_
        - Check `{$repo}/src/target/site/junit-noframes.html` file

#### _Checkout UI Branch_
- `git checkout uiAdidas`
    - _Run the testsuite in Local_
        - `cd uiAdidas`
        - `mvn clean site`
	- _Check the testsuite result_
        - Check `{$dir}/src/target/site/surefire-report.html` file


