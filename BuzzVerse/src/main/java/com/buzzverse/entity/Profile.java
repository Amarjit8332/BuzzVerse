package com.buzzverse.entity;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Personal Attributes
    private String userName;
    private String profession;
    private String email;
    private String phone;
    private String dob;
    private String nationality;
    private String location;
    private String languages;

    // Professional Background
    @Column(length = 1024)
    private String professionalBackground;

    // Physical Appearance
    private String height;
    private String build;
    private String style;
    private String fitness;

    // Availability & Preferences
    private String travelWillingness;
    private String scheduleFlexibility;
    private String preferredCollaboration;
    private String feeRange;

    // Audience Demographic, Performance Metrics, Social Media Presence, Additional Skills, Artistic Style, Personality Traits
    @ElementCollection
    private List<String> audienceDemographic;

    @ElementCollection
    private List<String> performanceMetrics;

    @ElementCollection
    private List<String> socialMediaPresence;

    @ElementCollection
    private List<String> additionalSkills;

    @ElementCollection
    private List<String> artisticStyle;

    @ElementCollection
    private List<String> personalityTraits;

    // Values & Beliefs
    private String philanthropicInterests;
    private String environmentalStance;
    private String politicalViews;
    private String brandAffinity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getProfessionalBackground() {
		return professionalBackground;
	}
	public void setProfessionalBackground(String professionalBackground) {
		this.professionalBackground = professionalBackground;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getFitness() {
		return fitness;
	}
	public void setFitness(String fitness) {
		this.fitness = fitness;
	}
	public String getTravelWillingness() {
		return travelWillingness;
	}
	public void setTravelWillingness(String travelWillingness) {
		this.travelWillingness = travelWillingness;
	}
	public String getScheduleFlexibility() {
		return scheduleFlexibility;
	}
	public void setScheduleFlexibility(String scheduleFlexibility) {
		this.scheduleFlexibility = scheduleFlexibility;
	}
	public String getPreferredCollaboration() {
		return preferredCollaboration;
	}
	public void setPreferredCollaboration(String preferredCollaboration) {
		this.preferredCollaboration = preferredCollaboration;
	}
	public String getFeeRange() {
		return feeRange;
	}
	public void setFeeRange(String feeRange) {
		this.feeRange = feeRange;
	}
	public List<String> getAudienceDemographic() {
		return audienceDemographic;
	}
	public void setAudienceDemographic(List<String> audienceDemographic) {
		this.audienceDemographic = audienceDemographic;
	}
	public List<String> getPerformanceMetrics() {
		return performanceMetrics;
	}
	public void setPerformanceMetrics(List<String> performanceMetrics) {
		this.performanceMetrics = performanceMetrics;
	}
	public List<String> getSocialMediaPresence() {
		return socialMediaPresence;
	}
	public void setSocialMediaPresence(List<String> socialMediaPresence) {
		this.socialMediaPresence = socialMediaPresence;
	}
	public List<String> getAdditionalSkills() {
		return additionalSkills;
	}
	public void setAdditionalSkills(List<String> additionalSkills) {
		this.additionalSkills = additionalSkills;
	}
	public List<String> getArtisticStyle() {
		return artisticStyle;
	}
	public void setArtisticStyle(List<String> artisticStyle) {
		this.artisticStyle = artisticStyle;
	}
	public List<String> getPersonalityTraits() {
		return personalityTraits;
	}
	public void setPersonalityTraits(List<String> personalityTraits) {
		this.personalityTraits = personalityTraits;
	}
	public String getPhilanthropicInterests() {
		return philanthropicInterests;
	}
	public void setPhilanthropicInterests(String philanthropicInterests) {
		this.philanthropicInterests = philanthropicInterests;
	}
	public String getEnvironmentalStance() {
		return environmentalStance;
	}
	public void setEnvironmentalStance(String environmentalStance) {
		this.environmentalStance = environmentalStance;
	}
	public String getPoliticalViews() {
		return politicalViews;
	}
	public void setPoliticalViews(String politicalViews) {
		this.politicalViews = politicalViews;
	}
	public String getBrandAffinity() {
		return brandAffinity;
	}
	public void setBrandAffinity(String brandAffinity) {
		this.brandAffinity = brandAffinity;
	}
	public Profile() {
		
	}

    // Getters and Setters
   
}

