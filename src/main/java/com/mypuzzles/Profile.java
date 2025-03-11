package com.mypuzzles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    public Long id;
    public Long organizationId;
    public Long groupId;

    public Profile(long l, long l1, long l2) {


    }

    public static Map<Long, Map<Long, List<Profile>>> groupByOrgIdAndGroupId(List<Profile> data) {
        // Create the result map that will hold organizationId -> (groupId -> List<Profile>)
        Map<Long, Map<Long, List<Profile>>> result = new HashMap<>();

        // Iterate through each profile in the input list
        for (Profile profile : data) {
            // Get or create the inner map for this organizationId
            Map<Long, List<Profile>> groupMap = result.computeIfAbsent(profile.organizationId, k -> new HashMap<>());

            // Get or create the list for this groupId within the organization
            List<Profile> profiles = groupMap.computeIfAbsent(profile.groupId, k -> new ArrayList<>());

            // Add the current profile to the appropriate list
            profiles.add(profile);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(1L, 0L, 1L));
        profiles.add(new Profile(2L, 0L, 1L));
        profiles.add(new Profile(3L, 0L, 2L));
        profiles.add(new Profile(4L, 1L, 1L));
        profiles.add(new Profile(5L, 1L, 2L));

        Map<Long, Map<Long, List<Profile>>> result = groupByOrgIdAndGroupId(profiles);
        // Print result
        System.out.println(result);
    }

}
