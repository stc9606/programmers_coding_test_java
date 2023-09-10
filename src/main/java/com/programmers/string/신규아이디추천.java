package com.programmers.string;

public class 신규아이디추천 {

    /**
     * @조건1 - 아이디의 길이는 3자 이상 15자 이하
     * @조건2 - 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용
     * @조건3 - 마침표는 처음과 끝에 사용할 수 없으며, 또한 연속으로 사용 불가능
     *
     */

    private static String newId = "...!@BaT#*..y.abcdefghijklm";

    public static void main(String[] args) {

        // 1단계 - 모든 대문자를 대응되는 소문자로 치환
        newId = newId.toLowerCase();

        // 2단계 - 조건2의 문자들을 제외한 모든 문자 제거
        newId = newId.replaceAll("[^a-z0-9\\-_.]", "");

        // 3단계 - 마침표가 2번 이상 연속된 부부을 하나의 마침표로 치환
        newId = newId.replaceAll("\\.+", ".");

        // 4단계 - 마침표 처음 또는 끝인 경우 제거
        newId = newId.replaceAll("^\\.+|\\.+$", "");

        // 5단계 - 빈 문자열 -> "a"를 대입
        if (newId.isEmpty())
            newId = "a";

        // 6단계 - 길이 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문달을 모두 제거
        if (newId.length() >= 16)
            newId = newId.substring(0, 15).replaceAll("\\.+$", "");

        // 7단계 - 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙이기
        while (newId.length() < 3)
            newId += newId.charAt(newId.length() - 1);

        System.out.println(newId);
    }
}
