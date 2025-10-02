@erkan87
Feature: US_15

Scenario: [US_015] - [TC-ORG-001]: Verify Organizations Section Visibility

Given the user navigates to the homepage "https://qa.instulearn.com/"
When the "Organizations" heading is displayed
Then the subtitle text "#Greatest education organizations are here to help you" should be displayed
And the "All Organizations" button should be displayed


Scenario: [US_015] - [TC-ORG-002]: Verify Organizations Slider and Card Interaction

Given the user is on the homepage "https://qa.instulearn.com/"
And the "Organizations" heading is displayed
When the horizontal slider/band containing at least 4 organization cards is displayed
And the user verifies the navigation dots (or arrow buttons) below the slider
And the user clicks on the "Affogato Media" card displayed in the list
Then the user is directed to the organization details page
And the user clicks the back button to return to the homepage


Scenario: [US_015] - [TC-ORG-003]: Verify Organization Card Data Consistency

Given the user is on the homepage "https://qa.instulearn.com/"
And the "Organizations" heading is displayed
When the user inspects the first card listed in the slider (e.g., King Pictures)
Then the following components and data within the card should be correctly displayed:
Then Logo: An actual logo for "King Pictures"
Then Organization Name: The text "King Pictures"
Then Description: The text "High Quality Training"
Then Course Count: The label "1 Courses" (or "1 Kurs" if localization is expected)
And the user verifies that every organization card in the slider consistently displays the Logo, Name, Description, and Course Count.


Scenario: [US_015] - [TC-ORG-004[US_015] - [TC-ORG-002]]: Verify Navigation to All Organizations Page

Given the user is on the homepage "https://qa.instulearn.com/"
And the "Organizations" heading and the "All Organizations" button are displayed
When the user clicks the "All Organizations" button
Then the user should be redirected to the URL "https://qa.instulearn.com/organizations"



