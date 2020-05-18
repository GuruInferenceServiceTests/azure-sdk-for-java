// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RecurrentSchedule model. */
@Fluent
public final class RecurrentSchedule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecurrentSchedule.class);

    /*
     * the timezone for the hours of the profile. Some examples of valid time
     * zones are: Dateline Standard Time, UTC-11, Hawaiian Standard Time,
     * Alaskan Standard Time, Pacific Standard Time (Mexico), Pacific Standard
     * Time, US Mountain Standard Time, Mountain Standard Time (Mexico),
     * Mountain Standard Time, Central America Standard Time, Central Standard
     * Time, Central Standard Time (Mexico), Canada Central Standard Time, SA
     * Pacific Standard Time, Eastern Standard Time, US Eastern Standard Time,
     * Venezuela Standard Time, Paraguay Standard Time, Atlantic Standard Time,
     * Central Brazilian Standard Time, SA Western Standard Time, Pacific SA
     * Standard Time, Newfoundland Standard Time, E. South America Standard
     * Time, Argentina Standard Time, SA Eastern Standard Time, Greenland
     * Standard Time, Montevideo Standard Time, Bahia Standard Time, UTC-02,
     * Mid-Atlantic Standard Time, Azores Standard Time, Cape Verde Standard
     * Time, Morocco Standard Time, UTC, GMT Standard Time, Greenwich Standard
     * Time, W. Europe Standard Time, Central Europe Standard Time, Romance
     * Standard Time, Central European Standard Time, W. Central Africa
     * Standard Time, Namibia Standard Time, Jordan Standard Time, GTB Standard
     * Time, Middle East Standard Time, Egypt Standard Time, Syria Standard
     * Time, E. Europe Standard Time, South Africa Standard Time, FLE Standard
     * Time, Turkey Standard Time, Israel Standard Time, Kaliningrad Standard
     * Time, Libya Standard Time, Arabic Standard Time, Arab Standard Time,
     * Belarus Standard Time, Russian Standard Time, E. Africa Standard Time,
     * Iran Standard Time, Arabian Standard Time, Azerbaijan Standard Time,
     * Russia Time Zone 3, Mauritius Standard Time, Georgian Standard Time,
     * Caucasus Standard Time, Afghanistan Standard Time, West Asia Standard
     * Time, Ekaterinburg Standard Time, Pakistan Standard Time, India Standard
     * Time, Sri Lanka Standard Time, Nepal Standard Time, Central Asia
     * Standard Time, Bangladesh Standard Time, N. Central Asia Standard Time,
     * Myanmar Standard Time, SE Asia Standard Time, North Asia Standard Time,
     * China Standard Time, North Asia East Standard Time, Singapore Standard
     * Time, W. Australia Standard Time, Taipei Standard Time, Ulaanbaatar
     * Standard Time, Tokyo Standard Time, Korea Standard Time, Yakutsk
     * Standard Time, Cen. Australia Standard Time, AUS Central Standard Time,
     * E. Australia Standard Time, AUS Eastern Standard Time, West Pacific
     * Standard Time, Tasmania Standard Time, Magadan Standard Time,
     * Vladivostok Standard Time, Russia Time Zone 10, Central Pacific Standard
     * Time, Russia Time Zone 11, New Zealand Standard Time, UTC+12, Fiji
     * Standard Time, Kamchatka Standard Time, Tonga Standard Time, Samoa
     * Standard Time, Line Islands Standard Time
     */
    @JsonProperty(value = "timeZone", required = true)
    private String timeZone;

    /*
     * the collection of days that the profile takes effect on. Possible values
     * are Sunday through Saturday.
     */
    @JsonProperty(value = "days", required = true)
    private List<String> days;

    /*
     * A collection of hours that the profile takes effect on. Values supported
     * are 0 to 23 on the 24-hour clock (AM/PM times are not supported).
     */
    @JsonProperty(value = "hours", required = true)
    private List<Integer> hours;

    /*
     * A collection of minutes at which the profile takes effect at.
     */
    @JsonProperty(value = "minutes", required = true)
    private List<Integer> minutes;

    /**
     * Get the timeZone property: the timezone for the hours of the profile. Some examples of valid time zones are:
     * Dateline Standard Time, UTC-11, Hawaiian Standard Time, Alaskan Standard Time, Pacific Standard Time (Mexico),
     * Pacific Standard Time, US Mountain Standard Time, Mountain Standard Time (Mexico), Mountain Standard Time,
     * Central America Standard Time, Central Standard Time, Central Standard Time (Mexico), Canada Central Standard
     * Time, SA Pacific Standard Time, Eastern Standard Time, US Eastern Standard Time, Venezuela Standard Time,
     * Paraguay Standard Time, Atlantic Standard Time, Central Brazilian Standard Time, SA Western Standard Time,
     * Pacific SA Standard Time, Newfoundland Standard Time, E. South America Standard Time, Argentina Standard Time, SA
     * Eastern Standard Time, Greenland Standard Time, Montevideo Standard Time, Bahia Standard Time, UTC-02,
     * Mid-Atlantic Standard Time, Azores Standard Time, Cape Verde Standard Time, Morocco Standard Time, UTC, GMT
     * Standard Time, Greenwich Standard Time, W. Europe Standard Time, Central Europe Standard Time, Romance Standard
     * Time, Central European Standard Time, W. Central Africa Standard Time, Namibia Standard Time, Jordan Standard
     * Time, GTB Standard Time, Middle East Standard Time, Egypt Standard Time, Syria Standard Time, E. Europe Standard
     * Time, South Africa Standard Time, FLE Standard Time, Turkey Standard Time, Israel Standard Time, Kaliningrad
     * Standard Time, Libya Standard Time, Arabic Standard Time, Arab Standard Time, Belarus Standard Time, Russian
     * Standard Time, E. Africa Standard Time, Iran Standard Time, Arabian Standard Time, Azerbaijan Standard Time,
     * Russia Time Zone 3, Mauritius Standard Time, Georgian Standard Time, Caucasus Standard Time, Afghanistan Standard
     * Time, West Asia Standard Time, Ekaterinburg Standard Time, Pakistan Standard Time, India Standard Time, Sri Lanka
     * Standard Time, Nepal Standard Time, Central Asia Standard Time, Bangladesh Standard Time, N. Central Asia
     * Standard Time, Myanmar Standard Time, SE Asia Standard Time, North Asia Standard Time, China Standard Time, North
     * Asia East Standard Time, Singapore Standard Time, W. Australia Standard Time, Taipei Standard Time, Ulaanbaatar
     * Standard Time, Tokyo Standard Time, Korea Standard Time, Yakutsk Standard Time, Cen. Australia Standard Time, AUS
     * Central Standard Time, E. Australia Standard Time, AUS Eastern Standard Time, West Pacific Standard Time,
     * Tasmania Standard Time, Magadan Standard Time, Vladivostok Standard Time, Russia Time Zone 10, Central Pacific
     * Standard Time, Russia Time Zone 11, New Zealand Standard Time, UTC+12, Fiji Standard Time, Kamchatka Standard
     * Time, Tonga Standard Time, Samoa Standard Time, Line Islands Standard Time.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: the timezone for the hours of the profile. Some examples of valid time zones are:
     * Dateline Standard Time, UTC-11, Hawaiian Standard Time, Alaskan Standard Time, Pacific Standard Time (Mexico),
     * Pacific Standard Time, US Mountain Standard Time, Mountain Standard Time (Mexico), Mountain Standard Time,
     * Central America Standard Time, Central Standard Time, Central Standard Time (Mexico), Canada Central Standard
     * Time, SA Pacific Standard Time, Eastern Standard Time, US Eastern Standard Time, Venezuela Standard Time,
     * Paraguay Standard Time, Atlantic Standard Time, Central Brazilian Standard Time, SA Western Standard Time,
     * Pacific SA Standard Time, Newfoundland Standard Time, E. South America Standard Time, Argentina Standard Time, SA
     * Eastern Standard Time, Greenland Standard Time, Montevideo Standard Time, Bahia Standard Time, UTC-02,
     * Mid-Atlantic Standard Time, Azores Standard Time, Cape Verde Standard Time, Morocco Standard Time, UTC, GMT
     * Standard Time, Greenwich Standard Time, W. Europe Standard Time, Central Europe Standard Time, Romance Standard
     * Time, Central European Standard Time, W. Central Africa Standard Time, Namibia Standard Time, Jordan Standard
     * Time, GTB Standard Time, Middle East Standard Time, Egypt Standard Time, Syria Standard Time, E. Europe Standard
     * Time, South Africa Standard Time, FLE Standard Time, Turkey Standard Time, Israel Standard Time, Kaliningrad
     * Standard Time, Libya Standard Time, Arabic Standard Time, Arab Standard Time, Belarus Standard Time, Russian
     * Standard Time, E. Africa Standard Time, Iran Standard Time, Arabian Standard Time, Azerbaijan Standard Time,
     * Russia Time Zone 3, Mauritius Standard Time, Georgian Standard Time, Caucasus Standard Time, Afghanistan Standard
     * Time, West Asia Standard Time, Ekaterinburg Standard Time, Pakistan Standard Time, India Standard Time, Sri Lanka
     * Standard Time, Nepal Standard Time, Central Asia Standard Time, Bangladesh Standard Time, N. Central Asia
     * Standard Time, Myanmar Standard Time, SE Asia Standard Time, North Asia Standard Time, China Standard Time, North
     * Asia East Standard Time, Singapore Standard Time, W. Australia Standard Time, Taipei Standard Time, Ulaanbaatar
     * Standard Time, Tokyo Standard Time, Korea Standard Time, Yakutsk Standard Time, Cen. Australia Standard Time, AUS
     * Central Standard Time, E. Australia Standard Time, AUS Eastern Standard Time, West Pacific Standard Time,
     * Tasmania Standard Time, Magadan Standard Time, Vladivostok Standard Time, Russia Time Zone 10, Central Pacific
     * Standard Time, Russia Time Zone 11, New Zealand Standard Time, UTC+12, Fiji Standard Time, Kamchatka Standard
     * Time, Tonga Standard Time, Samoa Standard Time, Line Islands Standard Time.
     *
     * @param timeZone the timeZone value to set.
     * @return the RecurrentSchedule object itself.
     */
    public RecurrentSchedule withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the days property: the collection of days that the profile takes effect on. Possible values are Sunday
     * through Saturday.
     *
     * @return the days value.
     */
    public List<String> days() {
        return this.days;
    }

    /**
     * Set the days property: the collection of days that the profile takes effect on. Possible values are Sunday
     * through Saturday.
     *
     * @param days the days value to set.
     * @return the RecurrentSchedule object itself.
     */
    public RecurrentSchedule withDays(List<String> days) {
        this.days = days;
        return this;
    }

    /**
     * Get the hours property: A collection of hours that the profile takes effect on. Values supported are 0 to 23 on
     * the 24-hour clock (AM/PM times are not supported).
     *
     * @return the hours value.
     */
    public List<Integer> hours() {
        return this.hours;
    }

    /**
     * Set the hours property: A collection of hours that the profile takes effect on. Values supported are 0 to 23 on
     * the 24-hour clock (AM/PM times are not supported).
     *
     * @param hours the hours value to set.
     * @return the RecurrentSchedule object itself.
     */
    public RecurrentSchedule withHours(List<Integer> hours) {
        this.hours = hours;
        return this;
    }

    /**
     * Get the minutes property: A collection of minutes at which the profile takes effect at.
     *
     * @return the minutes value.
     */
    public List<Integer> minutes() {
        return this.minutes;
    }

    /**
     * Set the minutes property: A collection of minutes at which the profile takes effect at.
     *
     * @param minutes the minutes value to set.
     * @return the RecurrentSchedule object itself.
     */
    public RecurrentSchedule withMinutes(List<Integer> minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeZone() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeZone in model RecurrentSchedule"));
        }
        if (days() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property days in model RecurrentSchedule"));
        }
        if (hours() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property hours in model RecurrentSchedule"));
        }
        if (minutes() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property minutes in model RecurrentSchedule"));
        }
    }
}
