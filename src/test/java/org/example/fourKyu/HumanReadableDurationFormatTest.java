package org.example.fourKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanReadableDurationFormatTest {
    @Test
    void givenNegativeInput_whenFormatDuration_thenOutputIsAnEmptyString() {
        //given
        int input = -1;
        String expected = "";

        //when
        String output = HumanReadableDurationFormat.formatDuration(input);

        //then
        assertEquals(expected, output);
    }

    @Test
    void givenInputEqual0_whenFormatDuration_thenOutputIsNow() {
        //given
        int input = 0;
        String expected = "now";

        //when
        String output = HumanReadableDurationFormat.formatDuration(input);

        //then
        assertEquals(expected, output);
    }

    @Test
    void givenInputEqual62_whenFormatDuration_thenOutputIs1MinuteAnd2Seconds() {
        //given
        int input = 62;
        String expected = "1 minute and 2 seconds";

        //when
        String output = HumanReadableDurationFormat.formatDuration(input);

        //then
        assertEquals(expected, output);
    }

    @Test
    void givenInputEqual3662_whenFormatDuration_thenOutputIs1Hour1MinuteAnd2Seconds() {
        //given
        int input = 3662;
        String expected = "1 hour, 1 minute and 2 seconds";

        //when
        String output = HumanReadableDurationFormat.formatDuration(input);

        //then
        assertEquals(expected, output);
    }

    @Test
    void givenInputEqual104525_whenFormatDuration_thenOutputIs1Day5Hours2MinutesAnd5Seconds() {
        //given
        int input = 104525;
        String expected = "1 day, 5 hours, 2 minutes and 5 seconds";

        //when
        String output = HumanReadableDurationFormat.formatDuration(input);

        //then
        assertEquals(expected, output);
    }
    @Test
    void givenInputEqual32651385_whenFormatDuration_thenOutputIs1Year12Days16HoursAnd59Seconds() {
        //given
        int input = 32630459;
        String expected = "1 year, 12 days, 16 hours and 59 seconds";

        //when
        String output = HumanReadableDurationFormat.formatDuration(input);

        //then
        assertEquals(expected, output);
    }

    @Test
    void givenInputEqual86400_whenFormatDuration_thenOutputIs1Day() {
        //given
        int input = 86400;
        String expected = "1 day";

        //when
        String output = HumanReadableDurationFormat.formatDuration(input);

        //then
        assertEquals(expected, output);
    }

}