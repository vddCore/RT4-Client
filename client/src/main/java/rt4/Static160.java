package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!na;")
	public static final JagString aClass100_761 = JagString.parse("(U3");

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
	public static int anInt3902 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!be;IB)V")
	public static void method3047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (GlRenderer.enabled) {
			Static46.method1187(arg0, arg1, arg2.anInt445 + arg0, arg2.anInt459 + arg1);
		}
		if (Static270.minimapState >= 3) {
			if (GlRenderer.enabled) {
				@Pc(44) Sprite local44 = arg2.method489(false);
				if (local44 != null) {
					local44.method1423(arg0, arg1);
				}
			} else {
				SoftwareRaster.method2504(arg0, arg1, arg2.anIntArray37, arg2.anIntArray45);
			}
		} else if (GlRenderer.enabled) {
			((GlSprite) Static106.compass).method1427(arg0, arg1, arg2.anInt445, arg2.anInt459, Static106.compass.width / 2, Static106.compass.height / 2, (int)Camera.yawTarget, 256, (GlSprite) arg2.method489(false));
		} else {
			((SoftwareSprite) Static106.compass).drawCompass(arg0, arg1, arg2.anInt445, arg2.anInt459, Static106.compass.width / 2, Static106.compass.height / 2, (int)Camera.yawTarget, arg2.anIntArray37, arg2.anIntArray45);
		}
		InterfaceList.rectangleRedraw[arg3] = true;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static231.anInt5205 + arg0 * Static81.anInt2222 >> 16;
		@Pc(19) int local19 = arg3 * Static81.anInt2222 - arg0 * Static231.anInt5205 >> 16;
		@Pc(29) int local29 = arg1 * Static109.anInt2886 + local19 * Static121.anInt3038 >> 16;
		@Pc(39) int local39 = arg1 * Static121.anInt3038 - local19 * Static109.anInt2886 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static109.anInt2886 + local19 * Static121.anInt3038 >> 16;
		@Pc(76) int local76 = arg2 * Static121.anInt3038 - local19 * Static109.anInt2886 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static240.screenLowerX && local87 < Static240.screenLowerX) {
			return false;
		} else if (local50 > Static247.screenUpperX && local87 > Static247.screenUpperX) {
			return false;
		} else if (local56 < Static1.screenLowerY && local93 < Static1.screenLowerY) {
			return false;
		} else {
			return local56 <= Static148.screenUpperY || local93 <= Static148.screenUpperY;
		}
	}
}