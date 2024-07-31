/*
 Navicat Premium Dump SQL

 Source Server         : localhost-brian
 Source Server Type    : PostgreSQL
 Source Server Version : 150007 (150007)
 Source Host           : localhost:9999
 Source Catalog        : db_livecode
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 150007 (150007)
 File Encoding         : 65001

 Date: 31/07/2024 12:01:00
*/


-- ----------------------------
-- Sequence structure for hibernate_sequence
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."hibernate_sequence";
CREATE SEQUENCE "public"."hibernate_sequence" 
INCREMENT 1
MINVALUE  1
MAXVALUE 9223372036854775807
START 1
CACHE 1;
ALTER SEQUENCE "public"."hibernate_sequence" OWNER TO "postgres";

-- ----------------------------
-- Table structure for lc_diskominfo_lapangan
-- ----------------------------
DROP TABLE IF EXISTS "public"."lc_diskominfo_lapangan";
CREATE TABLE "public"."lc_diskominfo_lapangan" (
  "id" int4 NOT NULL,
  "nama" varchar(255) COLLATE "pg_catalog"."default",
  "jenis" varchar(255) COLLATE "pg_catalog"."default",
  "alamat" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."lc_diskominfo_lapangan" OWNER TO "postgres";

-- ----------------------------
-- Records of lc_diskominfo_lapangan
-- ----------------------------
BEGIN;
INSERT INTO "public"."lc_diskominfo_lapangan" ("id", "nama", "jenis", "alamat") VALUES (1, 'Lapangan Bola Hatta', 'Lapangan Bola Kaki', 'Taman Siswa, Palembang');
COMMIT;

-- ----------------------------
-- Table structure for lc_diskominfo_transaksi
-- ----------------------------
DROP TABLE IF EXISTS "public"."lc_diskominfo_transaksi";
CREATE TABLE "public"."lc_diskominfo_transaksi" (
  "id" int4 NOT NULL,
  "nama" varchar(255) COLLATE "pg_catalog"."default",
  "contact" varchar(12) COLLATE "pg_catalog"."default",
  "catatan" varchar(255) COLLATE "pg_catalog"."default",
  "detail" varchar(255) COLLATE "pg_catalog"."default",
  "tanggal" date,
  "total" varchar(255) COLLATE "pg_catalog"."default",
  "sesi" varchar(255) COLLATE "pg_catalog"."default",
  "waktu" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."lc_diskominfo_transaksi" OWNER TO "postgres";

-- ----------------------------
-- Records of lc_diskominfo_transaksi
-- ----------------------------
BEGIN;
INSERT INTO "public"."lc_diskominfo_transaksi" ("id", "nama", "contact", "catatan", "detail", "tanggal", "total", "sesi", "waktu") VALUES (9, 'tes1', '082223192321', 'lapangan bersih', 'lapangan', NULL, '1230000', NULL, NULL);
INSERT INTO "public"."lc_diskominfo_transaksi" ("id", "nama", "contact", "catatan", "detail", "tanggal", "total", "sesi", "waktu") VALUES (8, 'tes1', '082223192321', 'lapangan bersih', 'lapangan', '2024-07-31', '1230000', NULL, NULL);
INSERT INTO "public"."lc_diskominfo_transaksi" ("id", "nama", "contact", "catatan", "detail", "tanggal", "total", "sesi", "waktu") VALUES (10, 'tes1', '082223192321', 'lapangan bersih', 'lapangan', '2024-07-31', '1230000', NULL, NULL);
COMMIT;

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
SELECT setval('"public"."hibernate_sequence"', 10, true);

-- ----------------------------
-- Primary Key structure for table lc_diskominfo_lapangan
-- ----------------------------
ALTER TABLE "public"."lc_diskominfo_lapangan" ADD CONSTRAINT "lc_diskominfo_pkey" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table lc_diskominfo_transaksi
-- ----------------------------
ALTER TABLE "public"."lc_diskominfo_transaksi" ADD CONSTRAINT "lc_diskominfo_copy1_pkey" PRIMARY KEY ("id");
