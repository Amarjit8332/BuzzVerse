package com.buzzverse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buzzverse.entity.Profile;
import com.buzzverse.repository.ProfileRepository;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile getProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public Profile createOrUpdateProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}
