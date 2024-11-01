Testing REST APIs
To test each endpoint in AuthController and ProfileController, use Postman .

Register User:

URL: POST http://localhost:8080/auth/signup
Body:
json

{
  "firstName": "Amarjit",
  "lastName": "Giri",
  "email": "amarjit123@.com",
  "phoneNumber": "1234567890",
  "password": "amar123",
  "confirmPassword": "amar123"
}

Expected Result: Response message "User registered successfully!" if registration is successful.
Request OTP for Login:

URL: POST http://localhost:8080/auth/login/request-otp
Params: firstName=Amarjit, phoneNumber=1234567890
Expected Result: "OTP sent to your phone number."
Verify OTP for Login:

URL: POST http://localhost:8080/auth/login/verify-otp
Params: phoneNumber=1234567890, otp=<OTP_RECEIVED>
Expected Result: "Login successful!" or "Invalid OTP."
Get Profile by ID:

URL: GET http://localhost:8080/api/profiles/{id}
Expected Result: Profile details for the given ID if it exists.
Create Profile:

 Create a New Profile
Method: POST
URL: http://localhost:8080/api/profiles
Body (JSON):
json
{
    "userName": "Virat Kohli",
    "profession": "Cricketer",
    "email": "drashwin@gmail.com",
    "phone": "+91 7411-XXX-XXX",
    "dob": "5 November 1988",
    "nationality": "Indian",
    "location": "Mumbai, India",
    "languages": "English, Punjabi, Kannada, Hindi",
    "professionalBackground": "Virat Kohli is a top cricketer...",
    "height": "5'9\"",
    "build": "Athletic",
    "style": "Sporty",
    "fitness": "Excellent",
    "travelWillingness": "Open to global travel...",
    "scheduleFlexibility": "High",
    "preferredCollaboration": "Brand endorsements",
    "feeRange": "INR 5-10 Crores per project",
    "audienceDemographic": ["Primary Audience", "Age Group"],
    "performanceMetrics": ["Campaign Success Rate", "Media Coverage"],
    "socialMediaPresence": ["Social Media Platforms", "Follower Count"],
    "additionalSkills": ["Musical Talents", "Public Speaking"],
    "artisticStyle": ["Signature Themes", "Creative Process"],
    "personalityTraits": ["Public Persona", "Authenticity"],
    "philanthropicInterests": "Education and health",
    "environmentalStance": "Against plastic usage",
    "politicalViews": "No political affiliation",
    "brandAffinity": "Associated with brands like Puma"
}
2. Get a Profile by ID
Method: GET
URL: http://localhost:8080/api/profiles/{id}
3. Update an Existing Profile
Method: PUT
URL: http://localhost:8080/api/profiles/{id}
Body: (Same as POST)
4. Delete a Profile
Method: DELETE
URL: http://localhost:8080/api/profiles/{id}
