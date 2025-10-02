Feature: Subscribe Now Text Visibility


  Scenario: There should be a link to the dashboard page on the homepage


    Given user goes to "instulearnUrl"
    Given user waits 2 seconds
    Then user clicks the login button in the Header
    And user write "emailRamazan" in email textBox
    And user write "passWordRamazan" in passWord texBox
    Then user clicks the login button under emailTextBox
    Then page should display  dasboard Menu

    Scenario: Courses, Meetings, Quizzes, Certificates, Financial, Support, Notifications, Settings,
    Log Out links should be visible and active in the sidebar on the dashboard

      Given user goes to "instuLearnUrl"
      Then user waits 2 seconds
      Then user clicks the login button in the Header
      And user write "emailRamazan" in email textBox
      And user write "passWordRamazan" in passWord texBox
      And user clicks the login button under emailTextBox
      And user click all link under the dashBoar Menu