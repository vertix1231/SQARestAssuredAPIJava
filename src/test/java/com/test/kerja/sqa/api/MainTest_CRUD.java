package com.test.kerja.sqa.api;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class MainTest_CRUD {
	private UserPost userPost = new UserPost();
	private UserGet userGet = new UserGet();
	private UserPatch userPatch = new UserPatch();
	private UserPut userPut = new UserPut();
	private UserDelete userDelete = new UserDelete();
	Scanner sc = new Scanner(System.in);
	public int valueid = 0;

	/*
	 * https://reqres.in/
	 * https://www.youtube.com/watch?v=mkIliGAePBM&ab_channel=AutomationStepbyStep
	 */

	@Test(priority = 0)
	public void test01_post() {
		System.out.println("membuat user: ");
		userPost.test01_post();
//		userGet.test_01();
	}

	@Test(priority = 1)
	public void test02_get() {
		System.out.println("masukan id user post terbaru metode get untuk menambah data user: ");
		int inputid = sc.nextInt();
		userGet.test_01(inputid);
		userGet.test_02(inputid);
		System.out.println("data id user sudah terdaftar dengan id "+inputid);

	}

	@Test(priority = 2)
	public void test03_patch() {
//		userGet.te
		Scanner sc = new Scanner(System.in);
		System.out.println("masukan id user dan nama patch terbaru metode untuk data user: ");
		int inputid = sc.nextInt();
		String inputnama = sc.next();
		userPatch.test03_patch(inputid, inputnama);
		System.out.println("test patch selesai");
	}

	@Test(priority = 3)
	public void test04_put() {
		System.out.println("masukan id user dan nama put terbaru metode untuk mengubah data user yang ada : ");
		int inputid = sc.nextInt();
		String inputnama = sc.next();
		userPut.test02_put(inputid, inputnama);
	}

	@Test(priority = 4)
	public void test04_delete() {
		System.out.println("masukan id user dan nama delete untuk menghapus user : ");
		int inputid = sc.nextInt();
		String inputnama = sc.next();
		userDelete.test04_delete(inputid, inputnama);

	}

}
